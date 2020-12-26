package com.cris.utils;

import java.util.Random;

/**
 * @author Crisani
 */
public class RandomDataGenerator {

    private static final String[] HEXADECIMAL_CHARACTER_TABLE = {
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};


    public static String generateHexadecimalStringData(int dataLength) {
        Random rd = new Random();
        StringBuilder sb = new StringBuilder();

        int bound = HEXADECIMAL_CHARACTER_TABLE.length - 1;
        for(int i = 0; i < dataLength; ++i) {
            sb.append(HEXADECIMAL_CHARACTER_TABLE[rd.nextInt(bound)]);
        }

        return sb.toString();
    }

}
