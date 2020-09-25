package br.com.recaptcha.v1.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.HashMap;
import java.util.Map;

public enum ErrorCodes {
    MissingSecret, InvalidSecret, MissingResponse, InvalidResponse, BadRequest, TimeoutOrDuplicate;

    private static Map<String, ErrorCodes> errorsMap = new HashMap<>(6);

    static {
        errorsMap.put("missing-input-secret", MissingSecret);
        errorsMap.put("invalid-input-secret", InvalidSecret);
        errorsMap.put("missing-input-response", MissingResponse);
        errorsMap.put("bad-request", InvalidResponse);
        errorsMap.put("invalid-input-response", BadRequest);
        errorsMap.put("timeout-or-duplicate", TimeoutOrDuplicate);
    }

    @JsonCreator
    public static ErrorCodes forValue(final String value) {
        return errorsMap.get(value.toLowerCase());
    }
}
