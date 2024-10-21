package com.example.APINasa.util;


import com.example.APINasa.model.Apod;
import com.example.APINasa.util.request.RequestApod;
import com.example.APINasa.util.response.ResponseApod;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.Map;
import java.util.logging.Logger;

import static com.example.APINasa.util.GlobalConstants.*;

public class ApiCalls {
        //Logger log = LoggerFactory.getLogger(ApiCalls.class);

        /*-------------- 1. APOD ---------------- */
//        public Apod apod_ApiCall(double requestID)
//        {
//                Apod apodValue = new Apod();
//                HttpClient client = HttpClient.newBuilder().build();
//                ResponseApod response = null;
//                String getapodCall = APOD_URL.getUrl();
//
//                System.out.printf("RequestID: {} - APOD REQUEST - APOD Request API CALL : {}", requestID, getapodCall);
//                RequestApod request = new RequestApod();
//                try
//                {
//                        response = client.execute(request);
//                        if(response!=null)
//                        {
//                                BufferedReader rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));
//                                String responseline = rd.readLine();
//                                log.info("RequestID: {} - APOD REQUEST - Get APOD Call : Response: {}", requestID, responseline);
//
//                                ObjectMapper mapper = new ObjectMapper();
//                                Map<String, Object> map = mapper.readValue(responseline, Map.class);
//
//                                apodValue.setApoddt((String) map.get("date"));
//                                apodValue.setApodExplation((String) map.get("explanation"));
//                                apodValue.setApodHdUrl((String) map.get("hdurl"));
//                                apodValue.setApodMedia_type((String) map.get("media_type"));
//                                apodValue.setApodTitle((String) map.get("title"));
//                                apodValue.setApodUrl((String) map.get("url"));
//
//                                return apodValue;
//                        }
//                        else
//                        {
//                                log.error("RequestID: {} - APOD REQUEST - Error Fetching response from APOD API", requestID);
//                                return null;
//                        }
//                }
//                catch (Exception e) {
//                        log.info("RequestID: {} - APOD REQUEST - Exception: Could not retrive APOD Information from API : {}",requestID, e.toString());
//                        return null;
//                }
//
//
//        }

        /*-------------- 2. EPIC ---------------- */
//        public String epic_ApiCall(double requestID)
//        {
//                HttpClient client = HttpClientBuilder.create().build();
//                HttpResponse response = null;
//                String getepicCall = EPIC_URL;
//
//                log.info("RequestID: {} - EPIC REQUEST - EPIC Request API CALL : {}", requestID, getepicCall);
//                HttpGet request = new HttpGet(getepicCall);
//                try
//                {
//                        response = client.execute(request);
//                        if(response!=null)
//                        {
//                                BufferedReader rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));
//                                String responseline = rd.readLine();
//                                log.info("RequestID: {} - EPIC REQUEST - Get EPIC Call : Response: {}", requestID, responseline);
//
//                                return responseline;
//
//                        }
//                        else
//                        {
//                                log.error("RequestID: {} - EPIC REQUEST - Error Fetching response from EPIC API", requestID);
//                                return null;
//                        }
//                }
//                catch (Exception e) {
//                        log.info("RequestID: {} - EPIC REQUEST - Exception: Could not retrive EPIC Information from API : {}",requestID, e.toString());
//                        return null;
//                }
//
//
//        }
//
//        /*-------------- 3. MARSROVER ---------------- */
//        public String marsrover_ApiCall(double requestID)
//        {
//                HttpClient client = HttpClientBuilder.create().build();
//                HttpResponse response = null;
//                String getMarsRoverCall = MARS_ROVER_URL;
//
//                log.info("RequestID: {} - MARS_ROVER REQUEST - MARS_ROVER Request API CALL : {}", requestID, getMarsRoverCall);
//                HttpGet request = new HttpGet(getMarsRoverCall);
//                try
//                {
//                        response = client.execute(request);
//                        if(response!=null)
//                        {
//                                BufferedReader rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));
//                                String responseline = rd.readLine();
//                                //log.info("RequestID: {} - MARS_ROVER REQUEST - Get MARS_ROVER Call : Response: {}", requestID, responseline);
//
//
//
//                                return responseline;
//
//                        }
//                        else
//                        {
//                                log.error("RequestID: {} - MARS_ROVER REQUEST - Error Fetching response from MARS_ROVER API", requestID);
//                                return null;
//                        }
//                }
//                catch (Exception e) {
//                        log.info("RequestID: {} - MARS_ROVER REQUEST - Exception: Could not retrive MARS_ROVER Information from API : {}",requestID, e.toString());
//                        return null;
//                }
//
//
//        }
//
//        /*-------------- 4. TECHPORT ---------------- */
//        public String techport_ApiCall(double requestID)
//        {
//                HttpClient client = HttpClientBuilder.create().build();
//                HttpResponse response = null;
//                String getTechportCall = TECHPORT_URL;
//
//                log.info("RequestID: {} - TECHPORT REQUEST - TECHPORT Request API CALL : {}", requestID, getTechportCall);
//                HttpGet request = new HttpGet(getTechportCall);
//                try
//                {
//                        response = client.execute(request);
//                        if(response!=null)
//                        {
//                                BufferedReader rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));
//                                String responseline = rd.readLine();
//                                //log.info("RequestID: {} - MARS_ROVER REQUEST - Get MARS_ROVER Call : Response: {}", requestID, responseline);
//                                return responseline;
//                        }
//                        else
//                        {
//                                log.error("RequestID: {} - TECHPORT REQUEST - Error Fetching response from TECHPORT API", requestID);
//                                return null;
//                        }
//                }
//                catch (Exception e) {
//                        log.info("RequestID: {} - TECHPORT REQUEST - Exception: Could not retrive TECHPORT Information from API : {}",requestID, e.toString());
//                        return null;
//                }
//
//
//        }
}
