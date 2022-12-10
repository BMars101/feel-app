package org.launchcode.feelapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping ("profile")
public class ProfileController {
    private static List<String> profile = new ArrayList<>();

    @GetMapping
    @ResponseBody
    public String name() {
        return "Profile";


    }
}