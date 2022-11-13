package org.launchcode.feelapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class ProfileController {

    @GetMapping("My Profile")
    @ResponseBody
    public String name(@PathVariable String name) {
        return "<html><body>"+
                "<h2> My Profile</h2>"+
                "</body></html>";
    }

   /* @GetMapping("My Profile")
    @ResponseBody
    public String nameoftheHydrator(@PathVariable String name, @RequestParam int age) {
        return name + "Hydrated!";
    }*/
}