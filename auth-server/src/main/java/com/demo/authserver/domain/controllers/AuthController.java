package com.demo.authserver.domain.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class AuthController {

    public static final String LOGIN_PAGE = "login";

    @RequestMapping
    @ResponseBody
    public String index() {
        return "OAuth 2 Server !!!";
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login() {
        return LOGIN_PAGE;
    }
}