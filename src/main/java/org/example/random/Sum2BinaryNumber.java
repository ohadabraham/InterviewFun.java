package org.example.random;

public class Sum2BinaryNumber {

    public static String sum2BinaryNumber ( String bin1 , String bin2 ) {

        int num1 = Integer.parseInt(bin1,2);
        int num2 = Integer.parseInt(bin2,2);

        int sum = num1+num2;
        String sumStr = Integer.toBinaryString(sum);

        return sumStr;

    }
    public static String sum2BinaryNumberFull ( String bin1 , String bin2 ) {


        int bin1Index=bin1.length()-1;
        int bin2Index=bin2.length()-1;
        int extra = 0;
        StringBuilder result= new StringBuilder();

        while ( bin1Index >= 0 || bin2Index >= 0 || extra != 0 ){
            int num1 = 0;
            if ( bin1Index >= 0) {
                num1 =  Character.getNumericValue(bin1.charAt(bin1Index));

            }
            int num2 =0;
            if ( bin2Index >= 0) {
                num2 = Character.getNumericValue(bin2.charAt(bin2Index));

            }
            int sum = num1+num2+extra;
            if (sum==3){
                result.insert(0,1);
                extra=1;
            }
            else if (sum==2){
                result.insert(0,0);
                extra=1;
            }else if (sum ==1 ){
                result.insert(0,1);
                extra=0;

            }else {
                result.insert(0,0);
                extra=0;


            }
            bin1Index--;
            bin2Index--;

        }
        return result.toString();
    }
}
