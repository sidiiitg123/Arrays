package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class NobleInteger {
    public int solve(ArrayList<Integer> A) {

        Collections.sort(A);

        for (int i =0;i<A.size();i++ ) {
            if (A.get(i) == A.get(i + 1) && i<A.size()-1) {
                continue;
            }
            if(A.get(i)==A.size()-1-i)
                return 1;
        }
        return -1;
    }
}
