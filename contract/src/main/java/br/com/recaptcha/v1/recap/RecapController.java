package br.com.recaptcha.v1.recap;

import br.com.recaptcha.v1.recap.model.RecapModel;
import br.com.recaptcha.v1.recap.model.RecapRequestContract;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RequestMapping("/v1/recaptcha")
@RestController
@AllArgsConstructor
public class RecapController {

    private final RecapFacadeContract recapFacadeContract;

    @CrossOrigin
    @PostMapping("/recaptchav3")
    public Mono<RecapModel> recaptchaV3(@RequestBody RecapRequestContract token) {
        System.out.println(token.getToken());
        return recapFacadeContract.recaptchaV3(token);
    }

    @GetMapping("/recaptchav2")
    public Mono<RecapModel> recaptchaV2(@RequestBody RecapRequestContract token) {
        return recapFacadeContract.recaptchaV2(token);
    }

}
