package com.epam.task.classbuilders;

import com.epam.task.classes.TariffWithoutPayroll;


import java.math.BigDecimal;
import java.util.ArrayList;

public class TariffWithoutPayrollBuilder extends AbstractTariffBuilder {
    private BigDecimal priceForMin;
    private BigDecimal priceForMb;

    public TariffWithoutPayrollBuilder(ArrayList<String> buildList) {
        super(  buildList.get(1), Integer.parseInt(buildList.get(2)),buildList.get(3));

        priceForMb = new BigDecimal(buildList.get(4));
        priceForMin = new BigDecimal( buildList.get(5));

    }
    public TariffWithoutPayroll build() {
        return new TariffWithoutPayroll(getNameOfTariff(),
                getNumOfSubscribers(),
                getTariffingType(),
                priceForMb, priceForMin);

    }
}
