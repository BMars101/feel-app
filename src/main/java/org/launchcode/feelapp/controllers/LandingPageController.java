package org.launchcode.feelapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class LandingPageController {

    @GetMapping("")
    public String helloFeel(){
        return "Hello, Feel App!";
    }


}
