package com.Spec.controllers;

import com.Spec.repos.PersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersControllers {
    @Autowired
    private PersRepo persRepo;

    @GetMapping("/pers-add")
    public String persAdd(Model model){
        return "options/pers-add";
    }
}
