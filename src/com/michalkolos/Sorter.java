package com.michalkolos;

import java.util.ArrayList;

public abstract class Sorter implements ISorter {
    private int steps;
    private int swaps;

    public Sorter(){
        resetStats();
    }

    @Override
    abstract public void sort(ArrayList<Integer> set);

    @Override
    public int getSteps() {
        return steps;
    }

    @Override
    public int getSwaps() {
        return swaps;
    }

    protected void resetStats(){
        steps = 0;
        swaps = 0;
    }

    protected void incrementSteps(){
        steps++;
    }

    protected void incrementSwaps(){
        swaps++;
    }


}
