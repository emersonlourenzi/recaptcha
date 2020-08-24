package br.com.recaptcha.v1.recap.model;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@ToString
@Data
public class RecapModelImpl {

    private boolean success;
    private String challengeTs;
    private String hostname;
    private float score;
    private String action;
    private ErrorCode[] errorCodes;

    enum ErrorCode {
        MissingSecret, InvalidSecret, MissingResponse, InvalidResponse, BadRequest, TimeoutOrDuplicate;

        private static Map<String, ErrorCode> errorsMap = new HashMap<>(6);

        static {
            errorsMap.put("missing-input-secret", MissingSecret);
            errorsMap.put("invalid-input-secret", InvalidSecret);
            errorsMap.put("missing-input-response", MissingResponse);
            errorsMap.put("bad-request", InvalidResponse);
            errorsMap.put("invalid-input-response", BadRequest);
            errorsMap.put("timeout-or-duplicate", TimeoutOrDuplicate);
        }

        @JsonCreator
        public static ErrorCode forValue(final String value) {
            return errorsMap.get(value.toLowerCase());
        }
    }

}
