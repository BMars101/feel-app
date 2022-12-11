package org.launchcode.feelapp.controllers;


import org.launchcode.feelapp.data.JournalRepository;
import org.launchcode.feelapp.models.JournalEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("journal")
public class JournalController {

    @Autowired
    JournalRepository journalRepository;

    @GetMapping
    public String displayJournal(Model model){
        model.addAttribute("journalEntries", journalRepository.findAll());

        return "journal/journalContents";

    }


@GetMapping("progress")
    public String displayWriteJournalContents(Model model){
    model.addAttribute("title", "Write Journal Entry");
    model.addAttribute("journalEntry", new JournalEntry());
    return "journal/progress";
}


@PostMapping("progress")
    public String processCreateJournalEntry(@Valid @ModelAttribute JournalEntry journalEntry, Errors errors, Model model){

    if (errors.hasErrors()){
        model.addAttribute("title", "Write Journal Entry");
        model.addAttribute(new JournalEntry());
        return "journal/progress";
    }
    journalRepository.save(journalEntry);
    return "redirect:";
}





}
