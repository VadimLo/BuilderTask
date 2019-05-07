package com.epam.task.classes;

public class TariffWithPayroll extends AbstractTariff {
    private int numberOfMin;
    private int numberOfMb;
    private double priceForMonth;

    public TariffWithPayroll(String nameOfTariff,
                             int numOfSubscribers,
                             String tariffingType,
                             int numberOfMb,
                             int numberOfMin,
                             double priceForMonth) {
        super(nameOfTariff, numOfSubscribers, tariffingType);
        this.numberOfMb = numberOfMb;
        this.numberOfMin = numberOfMin;
        this.priceForMonth = priceForMonth;

    }
    public int getNumberOfMb() {
        return numberOfMb;
    }
    public double getPriceForMonth() {
        return priceForMonth;
    }
    public int getNumberOfMin() {
        return this.numberOfMin;
    }




    public String getNameOfTariff() {
        return super.getNameOfTariff();
    }

    public int getNumOfSubscribers() {

        return super.getNumOfSubscribers();
    }
    public String getTariffingType() {
        return super.getTariffingType();
    }
}
