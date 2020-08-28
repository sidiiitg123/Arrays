package com.company;

import java.util.ArrayList;

public class ArrayBalance {
    public int solve(ArrayList<Integer> a) {
        if (a == null || a.size() == 2) {
            return 0;
        }

        if (a.size() == 1) {
            return 1;
        }

        int totalEven = 0;
        int totalOdd = 0;
        boolean even = true;
        for (int i = 0; i < a.size(); i++) {
            if (even) {
                totalEven += a.get(i);
            } else {
                totalOdd += a.get(i);
            }
            even = !even;
        }

        int lEven = 0;
        int rEven = 0;
        int lOdd = 0;
        int rOdd = 0;
        int count = 0;
        even = true;
        for (int i = 0; i < a.size(); i++) {
            if (even) {
                rEven = totalEven - lEven - a.get(i);
                rOdd = totalOdd - lOdd;
                if ((lEven + rOdd) == (lOdd + rEven)) {
                    count++;
                }
                lEven += a.get(i);
            } else {
                rEven = totalEven - lEven;
                rOdd = totalOdd - lOdd - a.get(i);
                if ((lEven + rOdd) == (lOdd + rEven)) {
                    count++;
                }
                lOdd += a.get(i);
            }

            even = !even;
        }

        return count;

    }
}
