package br.com.recaptcha.v1.recap;

import br.com.recaptcha.v1.recap.mapper.RecapMapper;
import br.com.recaptcha.v1.recap.model.RecapModel;
import br.com.recaptcha.v1.recap.model.RecapRequestContract;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public class RecapFacadeContract {

    private final RecapFacadeImpl recapFacade;

    public Mono<RecapModel> recaptchaV3(RecapRequestContract token) {
        return recapFacade.recaptchaV3(RecapMapper.mapperRecapRequestToImpl(token)).map(RecapMapper::mapperRecapToModel);
    }

    public Mono<RecapModel> recaptchaV2(String key) {
        return recapFacade.recaptchaV2(key).map(RecapMapper::mapperRecapToModel);
    }
}
