package org.launchcode.feelapp.controllers;

import org.launchcode.feelapp.data.UserRepository;
import org.launchcode.feelapp.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Optional;

@Controller

public class HomescreenController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthenticationController authenticationController;

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value="home-page")
    public String displayUserHomePage(HttpServletRequest request, Model model){
        HttpSession session = request.getSession();
        User user = authenticationController.getUserFromSession(session);
        model.addAttribute("username", "Hi " + user.getUsername() + "!");
        return "home-page";
    }



}
