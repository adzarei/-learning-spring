package com.adzarei.learningspring.services;

import com.adzarei.learningspring.common.K;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile(K.LANG_EN)
@Service(K.I18N_SERVICE)
public class I18nEnglishService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - i18n - PROFILE: EN";
    }
}
