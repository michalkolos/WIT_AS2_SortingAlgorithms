package com.michalkolos;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSorter extends Sorter{


    public BubbleSorter(){
        super();
    }

    @Override
    public void sort(ArrayList<Integer> set) {

        super.resetStats();

        int i, j;
        boolean swapped;
        int n = set.size();
        
        for (i = 0; i < n - 1; i++)
        {
            swapped = false;
            for (j = 0; j < n - i - 1; j++)
            {
                super.incrementSteps();
                if (set.get(j) > set.get(j + 1))
                {
                    Collections.swap(set, j, j + 1);
                    super.incrementSwaps();
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
    }
}
