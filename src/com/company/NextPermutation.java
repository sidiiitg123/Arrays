package com.company;

import java.util.ArrayList;

public class NextPermutation {


    public ArrayList<Integer> nextPermutation(ArrayList<Integer> A) {

        if (A.size() <= 1) return A;

        int i = A.size() - 1;
        while (i > 0 && A.get(i - 1) >= A.get(i))
            i--;

        if (i <= 0) {
            reverse(A, 0, A.size() - 1);
            return A;
        }

        int j = A.size() - 1;
        while (A.get(i - 1) >= A.get(j))
            j--;

        swap(A, i - 1, j);
        reverse(A, i, A.size() - 1);
        return A;
    }

    public void reverse(ArrayList<Integer> A, int start, int end) {
        while (start < end) {
            swap(A, start++, end--);
        }
    }

    public void swap(ArrayList<Integer> A, int i, int j) {
        int temp = A.get(i);
        A.set(i, A.get(j));
        A.set(j, temp);
    }
}

