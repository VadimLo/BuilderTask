package com.epam.task.sort;

import com.epam.task.classes.AbstractTariff;
import com.epam.task.factory.TariffFactory;
import com.epam.task.factory.TariffListCreator;
import org.apache.log4j.Logger;

import java.io.IOException;

public class SearchParameter {
    private final static Logger LOG = Logger.getLogger(SearchParameter.class);
    public AbstractTariff searchName(String name) throws IOException {
        for (AbstractTariff aList:TariffListCreator.createList() ) {
            String nameOfTariff = aList.getNameOfTariff();
            if(nameOfTariff.equals(name)){
                LOG.info("Found Tariff");
                return aList;
            }
        }
        return null;
    }
    public int countAllSubscribers() throws IOException {
        int countSubscribers=0;
        for (AbstractTariff aList:TariffListCreator.createList() ) {
            countSubscribers += aList.getNumOfSubscribers();
        }
        LOG.info("Subscribers count");
        return countSubscribers;
    }
    public AbstractTariff searchBeParameters(String name,int minSubscriber,String tariffingType) throws IOException {
        boolean equalsName=false;
        boolean equalsSub=false;
        boolean equalsType=false;
        for (AbstractTariff aList:TariffListCreator.createList() ) {
            equalsName = aList.getNameOfTariff().equals(name);
            equalsSub = aList.getNumOfSubscribers()>minSubscriber;
            equalsType = aList.getTariffingType().equals(tariffingType);

            if(equalsName&&equalsSub&&equalsType){
                return aList;
            }else {
                equalsName=false;
                equalsSub=false;
                equalsType=false;
            }
            LOG.info("Found Parameter");
        }
        return null;
    }
}
