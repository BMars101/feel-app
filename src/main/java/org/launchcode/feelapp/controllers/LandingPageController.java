package org.launchcode.feelapp.controllers;

import org.launchcode.feelapp.models.WaterIntake;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LandingPageController {

    private WaterIntake waterIntake = new WaterIntake();
    @GetMapping
    public String displayIndex(Model model){
        model.addAttribute("waterIntake", new WaterIntake());
        return "index";
    }

    @GetMapping("water-intake-teaser")
    public String displayWaterNeeds(Model model){
        model.addAttribute("waterIntake", waterIntake.getWaterNeeds());
        return "water-intake-teaser";
    }

    @PostMapping("water-intake-teaser")
    public String calculateWaterFromForm(@RequestParam double weight, @RequestParam(required = false) double dailyActivityTime){
        waterIntake = new WaterIntake(weight, dailyActivityTime);
        return "redirect:water-intake-teaser";
    }

}
