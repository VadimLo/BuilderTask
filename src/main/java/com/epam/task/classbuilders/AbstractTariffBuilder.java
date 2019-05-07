package com.epam.task.classbuilders;

import com.epam.task.classes.AbstractTariff;

public abstract class AbstractTariffBuilder {
    private  String nameOfTariff;
    private int numOfSubscribers;
    private  String tariffingType;
    public AbstractTariffBuilder(String nameOfTariff,int numOfSubscribers,String tariffingType) {
        this.nameOfTariff=nameOfTariff;
        this.numOfSubscribers=numOfSubscribers;
        this.tariffingType = tariffingType;

    }
    public abstract AbstractTariff build();

    public String getNameOfTariff() {
        return nameOfTariff;
    }

    public int getNumOfSubscribers() {
        return numOfSubscribers;
    }

    public String getTariffingType() {
        return tariffingType;
    }
}
