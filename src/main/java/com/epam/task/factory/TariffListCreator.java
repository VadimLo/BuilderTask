package com.epam.task.factory;

import com.epam.task.classes.AbstractTariff;
import com.epam.task.datareader.DataReader;
import com.epam.task.datareader.DataValidator;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TariffListCreator {
    private final static Logger LOG = Logger.getLogger(TariffListCreator.class);

    public static ArrayList<AbstractTariff> createList() throws IOException,NullPointerException {
        List<AbstractTariff> list =new ArrayList<>();
        ObjectCreator creator=new ObjectCreator();
        List<String[]> data=DataReader.readData();
        for (String[] aList:data) {
            ArrayList<String> row = DataValidator.checkRow(aList);
            if(row!=null){
                AbstractTariff abstractTariff=null;
                try {
                     abstractTariff = creator.createTariff(row);
                }catch (IllegalArgumentException e){
                    LOG.error(e);
                    continue;
                }
                list.add(abstractTariff);
            }
        }
        return (ArrayList<AbstractTariff>) list;
    }
}
