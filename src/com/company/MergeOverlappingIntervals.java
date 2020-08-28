package com.company;

import java.util.*;

public class MergeOverlappingIntervals {
    public class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }

    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {


        ArrayList<Interval> output=new ArrayList<>();
        Collections.sort(intervals, (i1,i2)-> i1.start-i2.start);
        Stack<Interval> myStack=new Stack<>();
        Stack<Interval> myStack2=new Stack<>();
        myStack.push(intervals.get(0));

        for(int i=1;i<intervals.size();i++){
            if(intervals.get(i).start<=myStack.peek().end){
                myStack.peek().end=Math.max(intervals.get(i).end,myStack.peek().end);
            }else if(intervals.get(i).start>myStack.peek().end){
                myStack.push(intervals.get(i));
            }
        }
        while(!myStack.isEmpty()){
            myStack2.push(myStack.pop());
        }
        while(!myStack2.isEmpty()){
           output.add(myStack2.pop());
        }
        return output;
    }
}
