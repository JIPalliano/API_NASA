package com.example.APINasa.util;

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
}
