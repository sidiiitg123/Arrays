package com.company;

import java.util.ArrayList;

public class SpiralMatrixII {
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        int arr[][] = new int [A][A];

        int top=0, bottom=A-1, left=0, right=A-1;
        int direction = 0, count = 1;

        while(left<=right && top<=bottom) {
            if(direction==0) {
                for(int i=left; i<=right; i++) {
                    arr[top][i] = count;
                    count++;
                }
                top++;
                direction = 1;
            } else if(direction==1) {
                for(int i=top; i<=bottom; i++) {
                    arr[i][right] = count;
                    count++;
                }
                right--;
                direction = 2;
            } else if(direction==2) {
                for(int i=right; i>=left; i--) {
                    arr[bottom][i] = count;
                    count++;
                }
                bottom--;
                direction = 3;
            } else if(direction==3) {
                for(int i=bottom; i>=top; i--) {
                    arr[i][left] = count;
                    count++;
                }
                left++;
                direction = 0;
            }
        }


        ArrayList<ArrayList<Integer>> finalList = new ArrayList();
        for(int i=0;i<A;i++) {
            ArrayList<Integer> list = new ArrayList();
            for(int j=0;j<A;j++) {
                list.add(arr[i][j]);
            }
            finalList.add(list);
        }

        return finalList;
    }
}
