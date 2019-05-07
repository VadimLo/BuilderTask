package com.epam.task.comparator;

import com.epam.task.classes.AbstractTariff;


import java.util.Comparator;

public class TariffTypeComparator implements Comparator<AbstractTariff> {
    @Override
    public int compare(AbstractTariff firstOperand, AbstractTariff secondOperand) {
        String firstType = firstOperand.getTariffingType();
        String secondType = secondOperand.getTariffingType();
        if (firstType.equals("minute")) {
            return 1;
        } else if (secondType.equals("minute")) {
            return -1;

        }
        return 0;
    }
}
