package com.company;

import java.util.ArrayList;

public class PerfectPeakOfArray {

    public int perfectPeak(ArrayList<Integer> A) {
       int[] flag=new int[A.size()];
       for(int i=0;i<A.size();i++){
           flag[i]=0;
       }
       int max=A.get(0);
        for(int i=1;i<A.size()-1;i++){
            if(A.get(i)>max){
                max=A.get(i);
                flag[i]=1;
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=A.size()-1;i>0;i--){
            //if some number is smallest in the right part and we encounter
            //a number which is greater than all values from left but less than right than return 1
            if(A.get(i)<min){
                min=A.get(i);
                if(flag[i]==1)
                    return 1;
            }
        }
        return 0;
    }
}
