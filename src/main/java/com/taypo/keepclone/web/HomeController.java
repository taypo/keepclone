package com.taypo.keepclone.web;

import com.taypo.keepclone.note.NoteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    NoteRepo noteRepo;

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("notes", noteRepo.findAll());
        return "home";
    }
}
