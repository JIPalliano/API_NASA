package com.example.APINasa.controller;

import com.example.APINasa.controller.Request.RequestApod;
import com.example.APINasa.util.ApiCalls;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
@RequestMapping(value = "/v1/api")
public class NasaController {

   final ApiCalls apiCallObj = new ApiCalls();

    @GetMapping(value="/nasa")
    public String apod(@RequestBody RequestApod request){
        return apiCallObj.apodApiCall(request);
    }

}
