package com.epam.test.comparatortest;

import com.epam.task.classes.TariffWithPayroll;
import com.epam.task.comparator.TariffNameComparator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TariffNameComparatorTest {
    @Test
    public void shouldReturnZeroWhenNamesEquals(){
        TariffNameComparator comparator= new TariffNameComparator();
        int result=comparator.compare(new TariffWithPayroll("",0,"",1,1,1),
                            new TariffWithPayroll("",0,"",1,1,1));
        Assert.assertEquals(0,result);
    }


}
