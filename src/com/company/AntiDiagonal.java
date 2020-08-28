package com.company;

import java.util.ArrayList;

public class AntiDiagonal {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {

        ArrayList<ArrayList<Integer>> output=new ArrayList<>();

        for(int col=0;col<A.get(0).size();col++){
            int startCol=col;
            int startRow=0;
            ArrayList<Integer> temp=new ArrayList<>();
            while(startRow<A.get(0).size() && startCol>=0){
                int value=A.get(startRow).get(startCol);
                temp.add(value);
                startRow++;
                startCol--;
            }
            output.add(temp);
        }

        for(int row=1;row<A.get(0).size();row++){
            int startRow=row;
            int startCol=A.get(0).size()-1;
            ArrayList<Integer> temp=new ArrayList<>();
            while(startCol>=0 && startRow<A.get(0).size()){
                int value=A.get(startRow).get(startCol);
                temp.add(value);
                startRow++;
                startCol--;
            }
            output.add(temp);
        }
        return output;
    }
}
