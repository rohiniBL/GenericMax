package com.bridgelabz.genericmax;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMaximum {

    MaximumNumber maximumNumber;

    @Before
    public void setUp() {
        maximumNumber=new MaximumNumber();
    }

    @Test
    public void givenThreeNumbers_shouldReturn_maxNumber() {
        Integer[] intvalue={1,2,3,4,5,6};
        Integer[] intgerValue = maximumNumber.toPrint(intvalue);
        Assert.assertArrayEquals(intvalue,intgerValue);
    }
}
