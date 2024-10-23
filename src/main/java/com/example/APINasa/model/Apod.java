package com.example.APINasa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Apod {

    private String apodDate;
    private String apodExplation;
    private String apodHdUrl;
    private String apodMedia_type;
    private String apodTitle;
    private String apodUrl;


}
