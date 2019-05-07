package com.epam.task.factory;

import com.epam.task.classbuilders.AbstractTariffBuilder;
import com.epam.task.classes.AbstractTariff;
import com.epam.task.datareader.DataValidator;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class ObjectCreator {
    private final static Logger LOG = Logger.getLogger(ObjectCreator.class);
    public AbstractTariff createTariff(ArrayList<String> list)throws IllegalArgumentException{
        Map<String,ArrayList<String>> map = new TreeMap<>();
        String key = list.get(0);
        map.put(key,list);
        AbstractTariffBuilder builder= TariffFactory.check((TreeMap<String,ArrayList<String>>) map);
        LOG.info("Create tariff");
        return builder.build();

    }
}
