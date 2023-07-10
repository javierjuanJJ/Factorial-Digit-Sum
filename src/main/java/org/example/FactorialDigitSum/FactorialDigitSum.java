package org.example.FactorialDigitSum;

import java.math.BigInteger;

public class FactorialDigitSum {


    public static int factorialDigitSum(int number){
        BigInteger numberResult = BigInteger.ONE;

        for (int counter = 1; counter <= number; counter++) {
            numberResult = new BigInteger(String.valueOf(numberResult.multiply(BigInteger.valueOf(counter))));
        }


        return sumDigitsNumber(numberResult);
    }

    private static int sumDigitsNumber(BigInteger number){
        BigInteger temp = number;
        BigInteger remainder = BigInteger.ZERO;
        int result = 0;

        while (temp.compareTo(BigInteger.ZERO) > 0){
            // System.out.println(temp.compareTo(BigInteger.ZERO));
            // remainder = (temp % 10);
            remainder = new BigInteger(String.valueOf(temp.mod(new BigInteger(String.valueOf(10)))));
            result += remainder.intValue();
            // System.out.println(remainder);
            // reverseNumber = reverseNumber + remainder;
            // reverseNumber = new BigInteger(String.valueOf(reverseNumber.add(new BigInteger(String.valueOf(remainder)))));

            // System.out.println(reverseNumber);
            // temp /= 10;
            temp = new BigInteger(String.valueOf(temp.divide(new BigInteger(String.valueOf(10)))));
        }

        return result;
    }


}
