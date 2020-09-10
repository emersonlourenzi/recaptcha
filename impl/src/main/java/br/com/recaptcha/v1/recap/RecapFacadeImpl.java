package br.com.recaptcha.v1.recap;

import br.com.recaptcha.v1.recap.model.RecapModelImpl;
import br.com.recaptcha.v1.recap.model.RecapRequestImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public class RecapFacadeImpl {

    private final RecapService recapService;

    public Mono<RecapModelImpl> recaptchaV3(RecapRequestImpl token) {
        return recapService.recaptchaV3(token);
    }

    public Mono<RecapModelImpl> recaptchaV2(RecapRequestImpl token) {
        return recapService.recaptchaV2(token);
    }
}
