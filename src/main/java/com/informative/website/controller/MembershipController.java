package com.informative.website.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.informative.website.model.MembershipModel;
import com.informative.website.repository.MembershipRepository;

@Controller
public class MembershipController {
    @Autowired
    private MembershipRepository membershipRepository;

    @GetMapping("/")
    public String showMembership(Model model) {
        List<MembershipModel> memberships = membershipRepository.findAll();
        model.addAttribute("memberships", memberships);
        return "index";
    }

}
