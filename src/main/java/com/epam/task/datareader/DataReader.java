package com.epam.task.datareader;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DataReader {
    private final static Logger LOG = Logger.getLogger(DataReader.class);
    private static Path dataFile= Paths.get("data.txt");

    public static List<String[]> readData() throws IOException {
        final List<String> list = new ArrayList<>(Files.readAllLines(dataFile));
        List<String[]> data = new ArrayList<>();
        for (String aList : list) {
            data.add((aList.split(" ")));
        }



        LOG.info("Read Data");
        return data;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }
}
