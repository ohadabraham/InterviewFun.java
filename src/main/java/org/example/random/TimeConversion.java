package org.example.random;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {

    public String getTimeConversion(String s) throws ParseException {
        s=s.replaceAll("P" , " P");
        s=s.replaceAll("A" , " A");

        DateFormat df12 = new SimpleDateFormat("hh:mm:ss aa");
        DateFormat df24 = new SimpleDateFormat("HH:mm:ss");
        try {
            Date dateToDate = df12.parse(s);
            String dateAsOutput = df24.format(dateToDate);
            System.out.print(dateAsOutput);
            return dateAsOutput;

        }catch ( Exception ex ) {
            throw ex;
        }

    }
}
