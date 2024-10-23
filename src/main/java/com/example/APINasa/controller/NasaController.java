package com.example.APINasa.controller;

import com.example.APINasa.model.Apod;
import com.example.APINasa.util.ApiCalls;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
@RequestMapping(value = "/v1/api")
public class NasaController {

   final ApiCalls apiCallObj = new ApiCalls();

    @GetMapping(value="/nasa")
    public Apod apod(@RequestParam String date){
        return apiCallObj.apodApiCall(date);
    }

}
