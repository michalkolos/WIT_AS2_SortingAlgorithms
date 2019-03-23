package com.michalkolos;

import java.util.ArrayList;
import java.util.Collections;

public class SelectionSorter extends Sorter{

    public SelectionSorter(){
        super();
    }

    @Override
    public void sort(ArrayList<Integer> set) {

        super.resetStats();

        int i, j;
        int n = set.size();
        int minElement;

        for (i = 0; i < n - 1; i++) {

            minElement = i;

            for (j = i + 1; j < n; j++) {
                super.incrementSteps();

                if (set.get(j) < set.get(minElement)) {
                    minElement = j;
                }
            }

            Collections.swap(set, minElement, i);
            super.incrementSwaps();
        }
    }
}
