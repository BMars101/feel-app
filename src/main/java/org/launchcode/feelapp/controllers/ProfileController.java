package org.launchcode.feelapp.controllers;

import org.launchcode.feelapp.data.ProfileRepository;
import org.launchcode.feelapp.models.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ProfileController {
    @Autowired
   private ProfileRepository profileRepository;
    @GetMapping("profile")
    public String name() {
        return "Profile";

    }
    @PostMapping("/create")
    public String processProfileForm(@ModelAttribute @Valid Profile profile) {
    profileRepository.save(profile);
    return "redirect:/create";

    }
    @GetMapping("/create")
    public String displayProfile(Model model) {
        model.addAttribute("profile", profileRepository.findAll());
        return "/create";
    }

//    public String checkActivityLevel(String activityLevel) {
//        if (activityLevel.equals("Low")) {
//            return "fatigue";
//        } else if (activityLevel.equals("Moderate")) {
//            return "Okay";
//        } else if (activityLevel.equals("I Never Stop!")) {
//            return "Energized!";
//        }
//
//
//        return activityLevel;
//    }
}