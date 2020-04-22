package com.freemind.creativeservices.controller;

import com.freemind.creativeservices.i18N.MessageConstants;
import com.freemind.creativeservices.i18N.MessageSourceFinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloController {

    @Autowired
    MessageSourceFinder messageSource;

    @GetMapping("/hello")
    public ResponseEntity<Object> helloUser() {
        return new ResponseEntity<>("Hello User", HttpStatus.OK);

    }

    @GetMapping("/helloworld")
    public ResponseEntity<Object> helloUserInternationalized(@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
        return new ResponseEntity<>(messageSource.getMessage(locale, MessageConstants.GOOD_MORNING, "India","India"), HttpStatus.OK);

    }


}
