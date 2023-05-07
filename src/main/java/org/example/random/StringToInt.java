package org.example.random;

public class StringToInt {
    public String getStringToInt ( String num1, String num2  ) {
        int num1AsInt = (int)(num1.charAt(0) - '0');
        int num2AsInt = (int)(num2.charAt(0) - '0');
        
        int response =  num1AsInt+ num2AsInt;
        String responseStr = response + "";

        System.out.println(responseStr);

        return responseStr;
    }
}
