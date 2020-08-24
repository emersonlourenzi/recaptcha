package br.com.recaptcha.v1.recap.mapper;

import br.com.recaptcha.v1.recap.model.RecapModel;
import br.com.recaptcha.v1.recap.model.RecapModelImpl;
import br.com.recaptcha.v1.recap.model.RecapRequestContract;
import br.com.recaptcha.v1.recap.model.RecapRequestImpl;

public class RecapMapper {

    public static RecapModel mapperRecapToModel(RecapModelImpl recapModel) {
        return RecapModel.builder()
                .action(recapModel.getAction())
                .challengeTs(recapModel.getChallengeTs())
                .hostname(recapModel.getHostname())
                .score(recapModel.getScore())
                .build();
    }

    public static RecapRequestImpl mapperRecapRequestToImpl(RecapRequestContract recapRequestContract) {
        return RecapRequestImpl.builder()
                .token(recapRequestContract.getToken())
                .build();
    }
}
