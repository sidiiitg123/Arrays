package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class MaximumSumSquareSubMatrix {

    public int solve(ArrayList<ArrayList<Integer>> A, int B) {
        int sum = 0;
        int temp = 0;
        int ans = Integer.MIN_VALUE;

        while (temp <= A.size() - B) {

            for (int i = 0; i < B; i++) {
                for (int j = temp; j < B + temp; j++) {
                    sum += A.get(j).get(i);
                }
            }
            ans = Math.max(ans, sum);

            for (int i = B; i < A.get(0).size(); i++) {
                for (int j = temp; j < B + temp; j++) {
                    sum += A.get(j).get(i);
                    sum -= A.get(j).get(i - B);
                }
                ans = Math.max(ans, sum);
            }
            sum = 0;
            temp++;
        }
        return ans;
    }
}
