package br.com.recaptcha.v1.recap.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@ToString
public class RecapRequestContract {
    private String token;
}
