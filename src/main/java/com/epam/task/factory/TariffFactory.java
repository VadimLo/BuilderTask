package com.epam.task.factory;

import com.epam.task.classbuilders.AbstractTariffBuilder;
import com.epam.task.classbuilders.TariffWithPacageBuilder;
import com.epam.task.classbuilders.TariffWithPayrollBuilder;
import com.epam.task.classbuilders.TariffWithoutPayrollBuilder;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.TreeMap;

public class TariffFactory {
    private final static Logger LOG = Logger.getLogger(TariffFactory.class);
    public static AbstractTariffBuilder check(TreeMap<String,ArrayList<String>> map) throws IllegalArgumentException {
        switch (map.firstKey()) {
            case "with": {
                LOG.info("Builder created");
                return  new TariffWithPayrollBuilder(map.get("with"));

            }
            case "without": {
                LOG.info("Builder created");
                return new TariffWithoutPayrollBuilder(map.get("without"));

            }
            case "wihtpace": {
                LOG.info("Builder created");
                return new TariffWithPacageBuilder(map.get("wihtpace"));

            }

        }
        throw new IllegalArgumentException("Type not correct");

    }

}
