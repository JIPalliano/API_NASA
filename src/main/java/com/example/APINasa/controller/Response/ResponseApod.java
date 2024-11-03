package com.example.APINasa.controller.Response;

import lombok.Builder;

@Builder
public record ResponseApod(
        String date,
        String explation,
        String hdUrl,
        String mediaType,
        String title,
        String url
) {
}
