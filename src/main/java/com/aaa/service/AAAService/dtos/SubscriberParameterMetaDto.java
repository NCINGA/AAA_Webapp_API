package com.aaa.service.AAAService.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SubscriberParameterMetaDto {
    private int id;
    private String parameter;
}