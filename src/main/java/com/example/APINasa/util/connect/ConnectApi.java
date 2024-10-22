package com.example.APINasa.util.connect;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import static com.example.APINasa.util.GlobalConstants.APOD_URL;

public class ConnectApi {

    public static String getBody(String date) throws IOException {
        System.out.println(APOD_URL.getUrl()+ "&date="+date);
        URL url = new URL(APOD_URL.getUrl()+ "&date="+date);
        URLConnection connection = url.openConnection();

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));


        String inputLine;
        StringBuilder response = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        return response.toString();
    }
}
