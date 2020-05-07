package com.Spec.controllers;

import com.Spec.repos.PersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersControllers {
    @Autowired
    private PersRepo persRepo;

    @GetMapping("/pers-add")
    public String persAdd(Model model){
        return "options/pers-add";
    }

    @PostMapping("/pers-add")
    public String persMade(@RequestParam String name, @RequestParam String clas, Model model){

        String spec_name;
        switch (clas){
            case "1": spec_name = "Воин";
                break;
            case "2": spec_name = "Маг";
                break;
            default: spec_name = "Никто";
                break;
        }
        model.addAttribute("name", name);
        model.addAttribute("clasName", spec_name);
        return "index";
    }
}
