package com.cris.utils;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RandomDataGeneratorTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void generateHexadecimalStringData() {
        int dataLength = 256;

        String hexString = RandomDataGenerator.generateHexadecimalStringData(dataLength);
        Assert.assertEquals(dataLength, hexString.length());
        for(int i = 0; i < hexString.length(); ++i) {
            Assert.assertEquals(true,
                    isHexadecimalCharacters(hexString.substring(i, i+1)));
        }
    }

    private boolean isHexadecimalCharacters(String subString) {
        return "0".equals(subString) || "1".equals(subString) || "2".equals(subString)
                || "3".equals(subString) || "4".equals(subString) || "5".equals(subString)
                || "6".equals(subString) || "7".equals(subString) || "8".equals(subString)
                || "9".equals(subString) || "A".equals(subString) || "B".equals(subString)
                || "C".equals(subString) || "D".equals(subString) || "E".equals(subString)
                || "F".equals(subString);
    }
}