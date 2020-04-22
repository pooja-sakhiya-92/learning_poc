package com.freemind.creativeservices.i18N;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Locale;

@Component
public class MessageSourceFinder {

    @Autowired
    MessageSource messageSource;

    public String getMessage(Locale locale, String property, String... argumentsList){
        return  messageSource.getMessage(property, argumentsList, locale);
    }
}
