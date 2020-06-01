package com.adzarei.learningspring.services;

import com.adzarei.learningspring.common.K;
import com.adzarei.learningspring.controllers.MyController;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({K.LANG_ES, K.DEFAULT_PROFILE})
@Service(K.I18N_SERVICE)
public class I18nSpanishService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - i18n - PROFILE: ESP";
    }
}
