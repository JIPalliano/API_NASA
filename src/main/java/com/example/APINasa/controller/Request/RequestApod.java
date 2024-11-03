package com.example.APINasa.controller.Request;

import lombok.Builder;

@Builder
public record RequestApod(
        String date,
        String explation,
        String hdUrl,
        String mediaType,
        String title,
        String url
) {
}
