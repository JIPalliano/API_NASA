package com.example.APINasa;


import com.example.APINasa.util.ApiCalls;
import com.example.APINasa.util.GlobalConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;


@SpringBootApplication
public class ApiNasaApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ApiNasaApplication.class, args);
		ApiCalls apiCalls = new ApiCalls();
		System.out.println(GlobalConstants.getDate("2000-08-10"));
	}

}
