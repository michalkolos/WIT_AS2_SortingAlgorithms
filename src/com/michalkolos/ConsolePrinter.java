package com.michalkolos;

import java.util.ArrayList;

public class ConsolePrinter implements IDataPrinter {

    @Override
    public void printSet(ArrayList<Integer> set) {

        System.out.println(set.toString() + "\n\n");
    }

    @Override
    public void printResults(int swaps, int steps) {
        System.out.println("Swaps = " + swaps);
        System.out.println("Steps = " + steps);

    }
}
