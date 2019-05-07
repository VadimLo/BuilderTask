package com.epam.task.comparator;

import com.epam.task.classes.AbstractTariff;

import java.util.Comparator;

public class TariffNameComparator implements Comparator<AbstractTariff> {
    @Override
    public int compare(AbstractTariff firstOperand, AbstractTariff secondOperand) {
        return firstOperand.getNameOfTariff().compareTo(secondOperand.getNameOfTariff());

    }
}
