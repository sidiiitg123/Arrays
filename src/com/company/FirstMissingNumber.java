package com.company;

import java.util.ArrayList;

public class FirstMissingNumber {

    public int segregate(ArrayList<Integer> A,int size){
        int j=0;
        for(int i=0;i<size;i++){
            if(A.get(i)<=0){
                int temp=A.get(i);
                A.set(i,A.get(j));
                A.set(j,temp);
                j++;
            }
        }
        return j;
    }

    public int fMPositive(int[] arr,int size){
        int i;
        for (i = 0; i < size; i++) {
            int x = Math.abs(arr[i]);
            if (x - 1 < size && arr[x - 1] > 0)
                arr[x - 1] = -arr[x - 1];
        }
        for (i = 0; i < size; i++)
            if (arr[i] > 0)
                return i + 1;
        return size + 1;
    }

    public int firstMissingPositive(ArrayList<Integer> A) {

       int shift=segregate(A,A.size());
       int[] arr2=new int[A.size()-shift];
       int j=0;
       for(int i=shift;i<A.size();i++){
           arr2[j]=A.get(i);
           j++;
       }
       return fMPositive(arr2,j);
    }
}
