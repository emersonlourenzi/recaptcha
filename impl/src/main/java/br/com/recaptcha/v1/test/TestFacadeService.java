package br.com.recaptcha.v1.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Data
public class TestFacadeService {

    private final TestService testService;

    public String test() {
        return testService.test();
    }
}
