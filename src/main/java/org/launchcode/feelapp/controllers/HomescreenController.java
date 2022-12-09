package org.launchcode.feelapp.controllers;

import org.launchcode.feelapp.data.UserRepository;
import org.launchcode.feelapp.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller

public class HomescreenController {

<<<<<<< HEAD
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value="home-page")
    public String displayUserHomePage(Model model){
        return "home-page";
    }
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value="home-page")
//    public String displayUserHomePage(@RequestParam String username, Model model){
//        User theUser = userRepository.findByUsername(username);
//        model.addAttribute("username", theUser);
//        return "home-page";
=======
//    @GetMapping("/")
//    public String displayUserHomePage(){
//        return "index";
>>>>>>> 434a403d09654726421111d2f72200f51c5a04c7
//    }

}
