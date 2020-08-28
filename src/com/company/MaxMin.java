package com.company;

import java.util.ArrayList;

public class MaxMin {
    public int solve(ArrayList<Integer> A) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=1;i<A.size();i++){
            if(A.get(i-1)<A.get(i)){
                min=Math.min(min,A.get(i-1));
                max=Math.max(max,A.get(i));
            }else{
                min=Math.min(min,A.get(i));
                max=Math.max(max,A.get(i-1));
            }
        }
        return min+max;
    }
}
