package com.epam.task.sort;

import com.epam.task.classes.AbstractTariff;
import com.epam.task.comparator.TariffNameComparator;
import com.epam.task.comparator.TariffSubscribersComparator;
import com.epam.task.comparator.TariffTypeComparator;
import com.epam.task.factory.TariffListCreator;

import java.io.IOException;
import java.util.List;

public class SortTariff {
    TariffListCreator creator= new TariffListCreator();
    public List<AbstractTariff> sortByName() throws IOException {
        List<AbstractTariff> newList = TariffListCreator.createList();
        newList.sort(new TariffNameComparator());
        return newList;
    }
    public List<AbstractTariff> sortBySubscribers() throws IOException {
        List<AbstractTariff> newList = TariffListCreator.createList();
        newList.sort(new TariffSubscribersComparator());
        return newList;
    }

    public List<AbstractTariff> sortByTariffingType() throws IOException {
        List<AbstractTariff> newList = TariffListCreator.createList();
        newList.sort(new TariffTypeComparator() );
        return newList;
    }
    public List<AbstractTariff> sortByTariffingTypeName() throws IOException {
        List<AbstractTariff> newList = TariffListCreator.createList();
        newList.sort(new TariffTypeComparator() );
        newList.sort(new TariffNameComparator() );
        return newList;
    }

}

