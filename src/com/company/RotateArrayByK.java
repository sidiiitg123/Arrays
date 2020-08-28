package com.company;

import java.util.ArrayList;

public class RotateArrayByK {
    public ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        if(B>A.size())
            B=B%A.size();
        for (int i = 0; i < A.size(); i++) {
            if(B+i>=A.size())
                ret.add(A.get(i+B-A.size()));
            else
                ret.add(A.get(i + B));
        }

        return ret;
    }
}
