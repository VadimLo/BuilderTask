package com.epam.task.classes;

public abstract class  AbstractTariff {
    private  String nameOfTariff;
    private int numOfSubscribers;
    private  String tariffingType;

    public AbstractTariff(String nameOfTariff,int numOfSubscribers,String tariffingType) {
        this.nameOfTariff=nameOfTariff;
        this.numOfSubscribers=numOfSubscribers;
        this.tariffingType = tariffingType;

    }


    public String getNameOfTariff(){
        return nameOfTariff;
    }

    public String getTariffingType() {
        return tariffingType;
    }

    public int getNumOfSubscribers() {
        return numOfSubscribers;
    }
}
