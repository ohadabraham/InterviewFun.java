package org.example.random;


import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
public class callAPI {

    public static void callAPIGET() throws IOException {
       // URL url = new URL("https://api-sca.checkmarx.net/public/packages/Python/requests/versions/1.0.0");
        String url = "https://api-sca.checkmarx.net/public/packages/Python/requests/versions/1.0.0";
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);
        request.setHeader("User-Agent", "Mozilla/5.0");
        request.setHeader("Custom-Header", "Custom-Value");

        HttpResponse response = httpClient.execute(request);
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println("Response Code: " + statusCode);

        String responseBody = EntityUtils.toString(response.getEntity());
        System.out.println("Response Body: " + responseBody);

    }
    public static void callAPIPOST() throws IOException {
        String url = "https://api-sca.checkmarx.net/public/vulnerabilities/packages";
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost request = new HttpPost(url);
        request.setHeader("User-Agent", "Mozilla/5.0");
        request.setHeader("Custom-Header", "Custom-Value");
        request.setHeader("Custom-Header", "Custom-Value");

        request.setHeader("Content-Type", "application/json");
        request.setHeader("Accept", "application/json");

        String requestBody = "[{\"PackageName\":\"activemq:activemq-core\",\"PackageManager\":\"Maven\",\"Version\":\"1.4\"}]";

        StringEntity entity = new StringEntity(requestBody, ContentType.APPLICATION_JSON);
        request.setEntity(entity);

        HttpResponse response = httpClient.execute(request);
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println("Response Code: " + statusCode);

        HttpEntity responseEntity = response.getEntity();
        String responseBody = EntityUtils.toString(responseEntity);
        System.out.println("Response Body: " + responseBody);

    }
    public static void callGet() throws IOException {
        URL url = new URL("https://api-sca.checkmarx.net/public/packages/Python/requests/versions/1.0.0");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("Content-Type", "application/json");

        con.setConnectTimeout(5000);
        con.setReadTimeout(5000);

        int status = con.getResponseCode();
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder content = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
    }
}
