package org.launchcode.feelapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LandingPageController {

    @GetMapping
    public String home(){
        return "home";
    }


}
