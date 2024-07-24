package com.gospeltube.videos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data @AllArgsConstructor
public class ResponseDto {
    private String responseCode;
    private String responseDescription;
    private boolean status;
    private Set<?> data;
}
