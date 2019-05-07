package com.epam.test.datavalidator;

import com.epam.task.datareader.DataValidator;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class DataValidatorTest {
    @Test
    public void shouldReturnRowWhenItValid(){
        String mas[] ={"1","IsData valid","."};
        List<String> list =Arrays.asList("1","IsData valid",".");
        Assert.assertEquals(DataValidator.checkRow(mas),list);

    }
    @Test
    public void shouldReturnNullWhenRowNotValid(){
        String mas[] ={"1","IsData not valid",","};
        Assert.assertNotEquals(DataValidator.checkRow(mas),null);

    }
}
