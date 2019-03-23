package com.michalkolos;

public class Main {

    public static void main(String[] args) {

        SortSet sortSet = new SortSet(
                new DataParser("./src/com/michalkolos/Data_unsort_0001.csv"),
                new ConsolePrinter(),
                new BubbleSorter()
        );

        sortSet.runTest();
    }
}
