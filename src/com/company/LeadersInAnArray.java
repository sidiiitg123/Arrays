package com.company;

import java.util.ArrayList;

public class LeadersInAnArray {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {

        int max=A.get(A.size()-1);
        ArrayList<Integer> output=new ArrayList<>();
        output.add(max);
        for(int i=A.size()-2;i>=0;i--){
            if(A.get(i)>max){
                max=A.get(i);
                output.add(max);
                continue;
            }
        }
        return output;
    }
}
