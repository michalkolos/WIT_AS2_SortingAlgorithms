package com.michalkolos;

import java.util.ArrayList;

public class SortSet {
    private ArrayList<Integer> mainSet;
    private IDataParser dataSource;
    private IDataPrinter dataPrinter;
    private ISorter sorter;

    public SortSet(IDataParser dataSource, IDataPrinter dataPrinter, Sorter sorter) {
        this.dataSource = dataSource;
        this.mainSet = dataSource.serveData();
        this.dataPrinter = dataPrinter;
        this.sorter = sorter;
    }

    public void sort(){
        sorter.sort(mainSet);
        dataPrinter.printResults(sorter.getSwaps(),sorter.getSteps());
    }

    public void printMainSet(){
        dataPrinter.printSet(mainSet);
    }

    public void reset(){
        mainSet = dataSource.serveData();
    }

    public void changeSorter(Sorter newSorter){
        sorter = newSorter;
    }

    public void runTest()
    {
        System.out.println("\n\nBubble Sort:");
        System.out.println("------------\n");
        sort();

        System.out.println("\n\nInsertion sort:");
        System.out.println("---------------\n");
        reset();
        changeSorter(new InsertionSorter());
        sort();

        System.out.println("\n\nSelection Sort:");
        System.out.println("---------------\n");
        reset();
        changeSorter(new SelectionSorter());
        sort();
    }
}
