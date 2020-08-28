package com.company;

import java.util.ArrayList;

public class FindPermutation {
    public ArrayList<Integer> findPerm(final String A, int B) {
        int low = 1, high = B;
        ArrayList<Integer> out = new ArrayList<Integer>();

        for (int i = 0; i < B - 1; i++){
            char c = A.charAt(i);

            if (c == 'D'){
                out.add(high);
                high--;
            }
            if (c == 'I'){
                out.add(low);
                low++;
            }
        }

        out.add(low);

        return out;
    }
}
