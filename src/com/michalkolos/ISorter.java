package com.michalkolos;

import java.util.ArrayList;

public interface ISorter {
    void sort(ArrayList<Integer> set);
    int getSteps();
    int getSwaps();
}
