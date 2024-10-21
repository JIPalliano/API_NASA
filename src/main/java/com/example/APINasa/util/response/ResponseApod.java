package com.example.APINasa.util.response;

import lombok.Builder;

@Builder
public record ResponseApod(
        String date,
        String url){
}
