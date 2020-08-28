package com.company;

import java.util.ArrayList;

public class MaxNonNegativeSubArray {
    public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        ArrayList<Integer> output = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        int sum = 0;
        int newsum = 0;

        for (Integer x : A) {

            if (x < 0) {
                newsum = 0;
                temp = new ArrayList<>();
            } else {
                temp.add(x);
                newsum += x;
            }
            if ((newsum > sum) || ((sum == newsum) && (temp.size() > output.size()))) {
                sum = newsum;
                output = temp;
            }

        }
        return output;
    }
}
