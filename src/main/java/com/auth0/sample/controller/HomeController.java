package com.auth0.sample.controller;

import com.auth0.sample.Auth0SAMLUserDetails;
import com.github.ulisesbocchio.spring.boot.security.saml.annotation.SAMLUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public ModelAndView home(@SAMLUser Auth0SAMLUserDetails user) {
        ModelAndView homeView = new ModelAndView("home");
        homeView.addObject("userId", user.getUsername());
        homeView.addObject("samlAttributes", user.getSampleAttributes());
        return homeView;
    }

}
