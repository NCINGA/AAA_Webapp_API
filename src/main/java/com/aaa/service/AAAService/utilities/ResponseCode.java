package com.aaa.service.AAAService.utilities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ResponseCode {

    ERROR("Error"),
    PLAN_FETCH_FAILED("Plan fetch failed"),
    PLAN_ATTRIBUTE_FETCH_FAILED("Plan attribute fetch failed"),
    SUBSCRIBER_CREATE_SUCCESS("Subscriber create success"),
    SUBSCRIBER_UPDATE_SUCCESS("Subscriber update success"),
    SUBSCRIBER_UPDATE_FAILED("Subscriber update failed"),
    SUBSCRIBER_CREATE_FAILED("Subscriber create failed"),
    USERNAME_OR_EMAIL_ALREADY_EXISTED("This username or email already used"),
    PLAN_PARAMETER_FETCH_FAILED("Plan parameter fetch failed"),
    ATTRIBUTE_FETCH_FAILED("Attribute group fetch failed"),
    FETCH_PROFILE_OVERRIDE_AVPS_FETCH_FAILED("Profile override avps fetch failed"),
    UPDATE_PARAMETERS("Update subscriber parameters success"),
    ATTRIBUTE_META_FETCH_FAILED("Attribute fetch failed"),
    PARAMETER_META_FETCH_FAILED("Parameter fetch failed"),
    PROFILE_META_FETCH_FAILED("Profile fetch failed");
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

}
