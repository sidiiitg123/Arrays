package com.company;

import java.util.ArrayList;

public class KthRowOfPascalTriangle {
    public ArrayList<Integer> getRow(int a) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        res.add(1);
        for(int i=1; i<=a; i++){
            int num = (a+1-i)*res.get(i-1)/i;
            res.add(num);
        }
        return res;
    }
}
