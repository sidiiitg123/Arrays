package com.company;

import java.util.ArrayList;

public class MinStepInfiniteGrid {
    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int numSteps = 0;
        for(int i = 1; i < X.size(); i++){
            numSteps += Math.max( Math.abs(X.get(i) - X.get(i-1)), Math.abs(Y.get(i) - Y.get(i-1)) );
        }
        return numSteps;
    }

}
