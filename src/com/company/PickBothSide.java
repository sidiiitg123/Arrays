package com.company;

import java.util.ArrayList;

public class PickBothSide {
    public int solve(ArrayList<Integer> A, int B) {
         int n=A.size();
         int result=0;
         for(int i=0;i<B;i++){
             result+=A.get(i);
         }
         int sum=result;

         for(int i=0;i<B;i++){
             sum-=A.get(B-1-i);
             sum+=A.get(n-1-i);
             result=Math.max(sum,result);
         }
         return result;
    }
}
