package com.example.APINasa.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public enum GlobalConstants {
    APOD_URL("https://api.nasa.gov/planetary/apod?api_key=IfL62QOicKOLtTrnkNtUtAp0vI4mPdoZa8EhGt1M"),

    EPIC_URL("https://api.nasa.gov/EPIC/api/natural/images?api_key=IfL62QOicKOLtTrnkNtUtAp0vI4mPdoZa8EhGt1M"),

    MARS_ROVER_URL("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=1000&api_key=IfL62QOicKOLtTrnkNtUtAp0vI4mPdoZa8EhGt1M"),

    TECHPORT_URL("https://api.nasa.gov/techport/api/projects/17792?api_key=IfL62QOicKOLtTrnkNtUtAp0vI4mPdoZa8EhGt1M"),

    EARTH_URL("https://api.nasa.gov/planetary/earth/imagery?lon=100.75&lat=1.5&date=2014-02-01&api_key=IfL62QOicKOLtTrnkNtUtAp0vI4mPdoZa8EhGt1M");

    private String url;

    GlobalConstants(String url){
        this.url = url;
    }
    public String getUrl() {
        return url;
    }

    public String getBody() {
        URL url = new URL(APOD_URL.getUrl());
        URLConnection connection = url.openConnection();

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));


        String inputLine;
        StringBuilder response = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
    }
}
