package br.com.recaptcha.v1.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Data
public class TestFacadeContract {

    private final TestFacadeService testFacadeService;

    public String test() {
        return testFacadeService.test();
    }
}
