package com.example.APINasa;


import com.example.APINasa.util.connect.ConnectApi;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ConnectApiTests {

    //private ConnectApi connectApi = new ConnectApi();

    @Test
    void getBodyT(){
        String test = ConnectApi.getBody("asd");

        assertEquals("2000-08-10",test);
        assertThrows(RuntimeException.class,()->ConnectApi.getBody("2000-08-10"));
    }
}
