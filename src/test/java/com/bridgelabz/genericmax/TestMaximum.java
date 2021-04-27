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
        Float[] floatsValue={1.0f,2.0f};
        Float[] intgerValue = maximumNumber.toPrint(floatsValue);
        Assert.assertArrayEquals(floatsValue,intgerValue);
    }
}
