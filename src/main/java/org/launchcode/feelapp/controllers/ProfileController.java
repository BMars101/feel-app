package org.launchcode.feelapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping ("profile")
public class ProfileController {
    private static List<String> profile = new ArrayList<>();

    @GetMapping("My Profile")
    @ResponseBody
    public String name(@PathVariable String name) {
        return "<html><body>"+
                "<h2> My Profile</h2>"+
                "</body></html>";
    }


}