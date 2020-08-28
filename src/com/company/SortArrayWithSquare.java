package com.company;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class SortArrayWithSquare {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {

        ArrayList<Integer> output=new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<A.size();i++){
            pq.add(A.get(i)*A.get(i));
        }
        while(!pq.isEmpty()){
            output.add(pq.poll());
        }
        return output;
    }
}
