package com.epam.task.classbuilders;

import com.epam.task.classes.TariffWithPayroll;

import java.math.BigDecimal;
import java.util.ArrayList;

public class TariffWithPayrollBuilder extends AbstractTariffBuilder {

    private int numberOfMin;
    private int numberOfMb;
    private double priceForMonth;

    public TariffWithPayrollBuilder(ArrayList<String> buildList) {
        super( buildList.get(1),
                Integer.parseInt( buildList.get(2)),
                buildList.get(3));
        numberOfMin = Integer.parseInt( buildList.get(4));
        numberOfMb = Integer.parseInt(buildList.get(5));
        priceForMonth = Double.parseDouble(buildList.get(6));

    }
    public TariffWithPayroll build() {

        return new TariffWithPayroll(getNameOfTariff(),
                getNumOfSubscribers(),
                getTariffingType(),
                numberOfMb,
                numberOfMin,
                priceForMonth);
    }
}
