package com.epam.test.factory;

import com.epam.task.classes.AbstractTariff;
import com.epam.task.factory.TariffListCreator;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;

public class TariffListCreatorTest {
    @Test
    public void shouldReturnCorrectNumOfTariffs() throws IOException {
      ArrayList<AbstractTariff> list =TariffListCreator.createList();
      int result =6;
      Assert.assertEquals(list.size(),result);

    }
}
