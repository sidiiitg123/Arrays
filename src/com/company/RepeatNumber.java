package com.company;

import java.util.List;

public class RepeatNumber {
    public int repeatedNumber(final List<Integer> a) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MAX_VALUE;

        int count1 = 0, count2 = 0;

        for (int i = 0; i < a.size(); i++) {
            if (first == a.get(i)) {
                count1++;
            } else if (second == a.get(i)) {
                count2++;
            } else if (count1 == 0) {
                count1++;
                first = a.get(i);
            } else if (count2 == 0) {
                count2++;
                second = a.get(i);
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == first)
                count1++;
            else if (a.get(i) == second)
                count2++;
        }
        if (count1 > a.size() / 3)
            return first;
        if (count2 > a.size() / 3)
            return second;

        return -1;

    }

}
