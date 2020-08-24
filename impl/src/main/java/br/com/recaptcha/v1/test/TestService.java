package br.com.recaptcha.v1.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Data
public class TestService {

    public String test() {
        return "FUNCIONOU . . .";
    }
}
