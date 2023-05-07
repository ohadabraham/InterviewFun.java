package org.example.random;


import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class CallApiAndGetJsonJavaOnly {

    public void getConnectAPIAndGetJsonData() throws MalformedURLException {
        String urlString = "https://example.com/api/getData?param=value";

        try {
            URL url = new URL(urlString);
            HttpURLConnection connection=(HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();

            if ( responseCode == HttpURLConnection.HTTP_OK ){
                InputStream inputStream= connection.getInputStream();
                BufferedReader reader= new BufferedReader(new InputStreamReader(inputStream));
                String line;
                StringBuilder response = new StringBuilder();
                while ( (line=reader.readLine()) !=null){
                    response.append(line);
                }
                reader.close();
                JSONObject json = new JSONObject(response.toString());
                JSONObject internalJson = json.getJSONObject("internal");
                String value = internalJson.getString("relevant");
            }else{
                System.out.println("Get response code : " + responseCode);

            }
            connection.disconnect();
        }catch ( Exception me) {
            System.out.println("Error" + me.getStackTrace());
        }


    }
}
