package com.example.rufaida;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;

@Controller
public class MemController {
    private final GitMember gitMember;

    public MemController(GitMember gitMember) {
        this.gitMember = gitMember;
    }


    @GetMapping("/git")
    String gitmember(Model model) throws IOException {
        model.addAttribute("git", gitMember.members("ReDI-School"));
        MyForm myForm = new MyForm();
        model.addAttribute("name", myForm);
        return "namesOfGithubOrg";
    }

    @PostMapping("/git")
    String postMmeber(Model model, @ModelAttribute("name") MyForm myform) throws IOException {
        model.addAttribute("git", gitMember.members(myform.getOrgName()));
        return "namesOfGithubOrg";
    }

}
