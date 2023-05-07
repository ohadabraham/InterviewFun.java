package org.example.random;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;

public class RomanNumberToInt {

    private char I = 'I'; //1
    private char V = 'V'; //5
    private char X = 'X'; //10
    private char L = 'L'; //50
    private char C = 'C'; // 100
    private char D = 'D'; // 500
    private char M = 'M'; // 1000

    public void getRomanNumberToInt(String romanNumber) {

        int result = 0;
        int i = 0;
        while (i < romanNumber.length()) {

            char ch = romanNumber.charAt(i);
            switch (ch) {
                case 'I':
                    if (i < romanNumber.length() - 1 && romanNumber.charAt(i + 1) == 'X') {
                        result += 9;
                        i++;
                    } else if (i < romanNumber.length() - 1 && romanNumber.charAt(i + 1) == 'V') {
                        result += 4;
                        i++;
                    } else {
                        result += 1;
                    }
                    break;

                case 'V':
                    result += 5;
                    i++;
                    break;
                case 'X':
                    if (i < romanNumber.length() - 1 && romanNumber.charAt(i + 1) == 'C') {
                        result += 90;
                        i++;
                    } else if (i < romanNumber.length() - 1 && romanNumber.charAt(i + 1) == 'L') {
                        result += 40;
                        i++;
                    } else {
                        result += 10;
                    }

                    break;
                case 'L':
                    result += 50;

                    break;
                case 'C':
                    if (i < romanNumber.length() - 1 && romanNumber.charAt(i + 1) == 'M') {
                        result += 900;
                        i++;
                    } else if (i < romanNumber.length() - 1 && romanNumber.charAt(i + 1) == 'D') {
                        result += 400;
                        i++;
                    } else {
                        result += 100;

                    }

                    break;
                case 'D':
                    result += 500;

                    break;
                case 'M':
                    result += 1000;

                    break;
            }
            i++;
        }
        System.out.println(" Romanian " + romanNumber + " , is " + result + " in digits");
    }

    public int getRomanNumberToInt1(String romanNumber) {

        int result =0;
        int i =0;

        while ( i < romanNumber.length() ) {
            char ch = romanNumber.charAt(i);

            switch ( ch ) {

                case 'I' :
                    if (  (i+1) < romanNumber.length() && romanNumber.charAt(i+1) == 'V'){
                        result += 5;
                        i++;
                    }else if (  (i+1) < romanNumber.length() && romanNumber.charAt(i+1) == 'X') {
                        result += 9;
                        i++;
                    }else {
                        result += 1;
                    }
                    break;
                case 'V' :
                    result += 51;

                    break;
                case 'X' :
                    if ( romanNumber.charAt(i+1) == 'C'){
                        result += 90;
                        i++;
                    }else if ( romanNumber.charAt(i+1) == 'L') {
                        result += 40;
                        i++;
                    }else {
                        result += 10;
                    }
                    break;
                case 'L' :
                    result +=50;

                    break;
                case 'C' :
                    if ( romanNumber.charAt(i+1) == 'M'){
                        result += 900;
                        i++;
                    }else if ( romanNumber.charAt(i+1) == 'D') {
                        result += 400;
                        i++;
                    }else {
                        result += 100;
                    }
                    break;
                case 'D' :
                    result += 500;

                    break;

                case 'M' :
                    result += 1000;

                    break;

            }
            i++;
        }
        return result;
    }

    public String getIntoToRoman(int num) {

        StringBuilder result= new StringBuilder();
        while ( num > 0 ){
            if ( num >= 1000 ){
                result.append("M");
                num = num -1000;
            } else if ( num >= 900 ){
                result.append("CM");
                num = num -900;
            } else if ( num >= 500 ){
                result.append("D");
                num = num -500;
            } else if ( num >= 400 ){
                result.append("CD");
                num = num -400;
            } else if ( num >= 100 ){
                result.append("C");
                num = num -100;
            } else if ( num >= 90 ){
                result.append("XC");
                num = num -90;
            }
            else if ( num >= 50 ){
                result.append("C");
                num = num -50;
            }
            else if ( num >= 40 ){
                result.append("XL");
                num = num -40;
            }
            else if ( num >= 10 ){
                result.append("X");
                num = num -10;
            }
            else if ( num >= 9 ){
                result.append("IX");
                num = 0;
            }
            else if ( num >= 5 ){
                result.append("V");
                num = num -5;
            }
            else if ( num >= 4 ){
                result.append("IV");
                num = 0;
            }
            else {
                result.append("I");
                num = num -1;
            }
        }
        return result.toString();
    }
}