package com.example.APINasa.util.request;

import lombok.Builder;

@Builder
public record RequestApod (
        String date,
        String url
) {
}
