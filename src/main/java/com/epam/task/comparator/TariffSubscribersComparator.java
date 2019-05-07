package com.epam.task.comparator;

import com.epam.task.classes.AbstractTariff;

import java.util.Comparator;

public class TariffSubscribersComparator implements Comparator<AbstractTariff> {
    @Override
    public int compare(AbstractTariff firstOperand, AbstractTariff secondOperand) {
        int firstNum = firstOperand.getNumOfSubscribers();
        int secondNum = secondOperand.getNumOfSubscribers();

        return Integer.compare(firstNum, secondNum);

    }
}
