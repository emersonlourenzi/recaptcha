package br.com.recaptcha.v1.test;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("v1/test")
@RestController
@AllArgsConstructor
public class TestController {

    private final TestFacadeContract testFacadeContract;

    @GetMapping
    public List<String> tests() {
        return List.of("Test");
    }

    @GetMapping("/worked")
    public String test() {
        return testFacadeContract.test();
    }

}
