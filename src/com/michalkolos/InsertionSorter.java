package com.michalkolos;

import java.util.ArrayList;
import java.util.Collections;

public class InsertionSorter extends Sorter {

    public InsertionSorter(){
        super();
    }

    @Override
    public void sort(ArrayList<Integer> set) {

        super.resetStats();

        int i, j;
        int n = set.size();
        int key;

        for (i = 1; i < n; ++i) {
            key = set.get(i);
            j = i - 1;

            while (j >= 0 && set.get(j) > key) {
                super.incrementSteps();
                super.incrementSwaps();
                set.set(j + 1, set.get(j));
                j = j - 1;
            }
            set.set(j + 1, key);
        }
    }
}
