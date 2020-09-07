package br.com.recaptcha.v1.recap;

import br.com.recaptcha.v1.recap.model.RecapModelImpl;
import br.com.recaptcha.v1.recap.model.RecapRequestImpl;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecapService {

    private WebClient webClient;
    private RestTemplate restTemplate;

    private static final String SECRETV2 = "6LcztrwZAAAAAJTRDiP3_ayqPIaxi29lEuwHeFuN";
    private static final String SECRETV3 = "6Lfi_LAZAAAAACjoTRX2BCS5RUL39NO3WZso4Wyw";
    private static final String SECRET_PARAM = "?secret=";
    private static final String RESPONSE_PARAM = "&response=";
    private static final String G_RECAPTCHA_RESPONSE = "g-recaptcha-response";
    private static final String SITE_VERIFY_URL = "https://www.google.com/recaptcha/api/siteverify";
    private static final String URLV3 = SITE_VERIFY_URL + SECRET_PARAM + SECRETV3 + RESPONSE_PARAM;
    private static final String URLV2 = SITE_VERIFY_URL + SECRET_PARAM + SECRETV2 + RESPONSE_PARAM;

    public Mono<RecapModelImpl> recaptchaV3(RecapRequestImpl token) {
        return WebClient.create(URLV3 + token.getToken())
                .post()
                .retrieve()
                .bodyToMono(RecapModelImpl.class);
    }

    public Mono<RecapModelImpl> recaptchaV2(RecapRequestImpl key) {
        return WebClient.create(URLV2 + key)
                .post()
                .retrieve()
                .bodyToMono(RecapModelImpl.class);
    }

}
