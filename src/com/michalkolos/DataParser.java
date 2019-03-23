package com.michalkolos;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DataParser implements IDataParser {

    static private ArrayList<Integer> dataTable;
    static private int dataCount;

    public DataParser(String fileName) {
        dataTable = new ArrayList<>();
        File file = new File(fileName);

        try {

            Scanner sc = new Scanner(file);

            dataCount = Integer.parseInt(sc.nextLine());

            while (sc.hasNextLine()) {
                dataTable.add(Integer.parseInt(sc.nextLine()));
            }

        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ArrayList<Integer> serveData() {
        if(dataTable.isEmpty()) {
            return null;
        }
        else {
            return new ArrayList<>(dataTable);
        }
    }


}
