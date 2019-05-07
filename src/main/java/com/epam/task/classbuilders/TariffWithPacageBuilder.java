package com.epam.task.classbuilders;

import com.epam.task.classes.TariffWithPackage;
import com.epam.task.classes.TariffWithoutPayroll;

import java.math.BigDecimal;
import java.util.ArrayList;

public class TariffWithPacageBuilder extends TariffWithoutPayrollBuilder {

    private String paceName;
    private BigDecimal packagePrice;

    public TariffWithPacageBuilder(ArrayList<String> buildList) {
        super(buildList)    ;
        paceName =  buildList.get(6);
        packagePrice = new BigDecimal(buildList.get(7));

    }
    private BigDecimal getPriceForMb() {
        return getPriceForMb();
    }
    public BigDecimal getPriceForMin(){
        return getPriceForMin();
    }
    public TariffWithPackage build(){
        return new TariffWithPackage(getNameOfTariff(),
                getNumOfSubscribers(),
                getTariffingType(),
                getPriceForMb(),
                getPriceForMin(),
                paceName,
                packagePrice);

    }


}
