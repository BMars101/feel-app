package org.launchcode.feelapp.controllers;

import org.launchcode.feelapp.data.UserRepository;
import org.launchcode.feelapp.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HomescreenController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthenticationController authenticationController;

    @GetMapping("")
    public String displayUserHomePage(HttpServletRequest request, Model model){
        HttpSession session = request.getSession();
        User user = authenticationController.getUserFromSession(session);
        model.addAttribute("userGreeting", "Welcome, " + user.getUsername() + "!");
        return "index";
    }

}
