package org.launchcode.feelapp.controllers;

import org.launchcode.feelapp.data.UserRepository;
import org.launchcode.feelapp.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller

public class HomescreenController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("home-page")
    public String displayUserHomePage(Model model){
        return "home-page";
    }

}
