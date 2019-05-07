package com.epam.task.classes;

import java.math.BigDecimal;

public class TariffWithPackage extends TariffWithoutPayroll {
    private String pacage ;
    private BigDecimal pacagePrice;


    @Override
    public BigDecimal getPriceForMb() {
        return super.getPriceForMb();
    }

    @Override
    public BigDecimal getPriceForMin() {
        return super.getPriceForMin();
    }

    public TariffWithPackage(String nameOfTariff, int numOfSubscribers, String tariffingType, BigDecimal priceForMb, BigDecimal priceForMin, String pacage, BigDecimal pacagePrice) {
        super(nameOfTariff, numOfSubscribers, tariffingType, priceForMb, priceForMin);
        this.pacage=pacage;
        this.pacagePrice=pacagePrice;
    }
}
