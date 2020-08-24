package br.com.recaptcha.v1.recap.model;

import lombok.*;

@AllArgsConstructor
@EqualsAndHashCode
@Builder
@ToString
@Data
public class RecapModel {

    private boolean success;
    private String challengeTs;
    private String hostname;
    private float score;
    private String action;

}
