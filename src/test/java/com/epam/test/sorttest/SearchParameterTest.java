package com.epam.test.sorttest;

import com.epam.task.classes.AbstractTariff;
import com.epam.task.sort.SearchParameter;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class SearchParameterTest {
    @Test
    public void shouldFindTariffWithCurrentName() throws IOException {
        SearchParameter parameter = new SearchParameter();
        AbstractTariff start = parameter.searchName("Start");
        Assert.assertEquals(start.getNameOfTariff(), "Start");
    }

    @Test
    public void shouldCountAllSubscribers() throws IOException {
        SearchParameter parameter = new SearchParameter();
        Assert.assertEquals(parameter.countAllSubscribers(), 6804);
    }

}
