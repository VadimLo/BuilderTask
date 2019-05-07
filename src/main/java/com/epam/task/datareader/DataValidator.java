package com.epam.task.datareader;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.epam.task.datareader.DataReader.readData;

public class DataValidator  {
    private final static Logger LOG = Logger.getLogger(DataValidator.class);
    private static Pattern pattern = Pattern.compile("^[A-Za-z0-9+\\s.]+$");


    public static ArrayList<String> checkRow(String[] mas){
        ArrayList<String> newList = new ArrayList<>(Arrays.asList(mas));
        Matcher matcher = pattern.matcher(newList.toString());
        boolean isFind = matcher.find();
        if(isFind){
            LOG.info("Row is  valid");

            return null;
        }
        return newList;


    }

}
