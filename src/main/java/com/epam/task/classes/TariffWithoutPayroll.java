package com.epam.task.classes;

import java.math.BigDecimal;

public class TariffWithoutPayroll extends AbstractTariff {
    private BigDecimal priceForMin;
    private BigDecimal priceForMb;


    public TariffWithoutPayroll(String nameOfTariff,
                                int numOfSubscribers,
                                String tariffingType,
                                BigDecimal priceForMb,
                                BigDecimal priceForMin) {
        super(nameOfTariff,numOfSubscribers,tariffingType);
        this.priceForMb =priceForMb;
        this.priceForMin=priceForMin;
    }

    public BigDecimal getPriceForMb() {
        return priceForMb;
    }

    public BigDecimal getPriceForMin() {
        return priceForMin;
    }


    public int getNumOfSubscribers() {
        return super.getNumOfSubscribers();
    }


    public String getNameOfTariff() {
        return super.getNameOfTariff();
    }


    public String getTariffingType() {
        return super.getTariffingType();
    }

}

