package com.epam.test.factory;

import com.epam.task.classes.AbstractTariff;
import com.epam.task.datareader.DataReader;
import com.epam.task.datareader.DataValidator;
import com.epam.task.factory.ObjectCreator;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ObjectCreatorTest {
    @Test
    public void ShouldWork() throws IOException {
        //TariffListCreatorTest creator=new TariffListCreatorTest();
        List<String[]> data= null;
        try {
            data = DataReader.readData();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ObjectCreator creator = new ObjectCreator();

        assert data != null;
        List<String> validList = DataValidator.checkRow(data.get(0));

        List<AbstractTariff> list =new ArrayList<>();
        list.add(creator.createTariff((ArrayList<String>) validList));
        System.out.println(list.get(0).getNameOfTariff());
    }
}
