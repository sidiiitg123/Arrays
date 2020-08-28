package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxUnsortedSubArray {
    public ArrayList<Integer> subUnsort(ArrayList<Integer> A) {

        if (A.size() <= 1) {
            return new ArrayList<>(Arrays.asList(-1));
        }
        int n = A.size();
        int lpos = 0;
        int rpos = n - 1;
        int max, min;

        for (lpos = 0; lpos < n - 1; lpos++) {
            if (A.get(lpos) > A.get(lpos + 1))
                break;
        }
        for (rpos = n - 1; rpos > 0; rpos--) {
            if (A.get(rpos) < A.get(rpos - 1))
                break;
        }
        if (lpos == n - 1 || rpos == 0)
            return new ArrayList<>(Arrays.asList(-1));

        max = A.get(lpos);
        min = A.get(lpos);

        for (int j = lpos + 1; j <= rpos; j++) {
            if (A.get(j) > max)
                max = A.get(j);
            if (A.get(j) < min)
                min = A.get(j);
        }
        for (int i = 0; i < lpos; i++) {
            if (A.get(i) > min) {
                lpos = i;
                break;
            }
        }
        for (int i = n-1; i > rpos; i--) {
            if (A.get(i) < max) {
                rpos=i;
                break;
            }
        }
        return new ArrayList<>(Arrays.asList(lpos,rpos));
    }
}
