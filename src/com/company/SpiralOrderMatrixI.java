package com.company;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrderMatrixI {

    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {

        ArrayList<Integer> output=new ArrayList<>();
        int top=0,left=0,right=A.get(0).size()-1,bottom=A.size()-1;
        int dir=0;
        while(top<=bottom && left<=right){
            if(dir==0){
                for(int i=left;i<=right;i++){
                    output.add(A.get(top).get(i));
                }
                top++;
            }else if(dir==1){
                for(int i=top;i<=bottom;i++){
                    output.add(A.get(i).get(right));
                }
                right--;
            }else if(dir==2){
                for(int i=right;i>=left;i--){
                    output.add(A.get(bottom).get(i));
                }
                bottom--;
            } else if(dir==3){
                for(int i=bottom;i>=top;i--){
                    output.add(A.get(i).get(left));
                }
                left++;
            }
            dir=(dir+1)%4;
        }
        return output;
    }
}
