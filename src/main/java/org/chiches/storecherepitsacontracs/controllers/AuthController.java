package org.chiches.storecherepitsacontracs.controllers;

import jakarta.validation.Valid;
import org.chiches.storecherepitsacontracs.dto.auth.LoginForm;
import org.chiches.storecherepitsacontracs.dto.user.UserForm;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("auth")
public interface AuthController {

    @GetMapping("login")
    String login(
            @Valid @ModelAttribute("form") LoginForm form,
            BindingResult bindingResult,
            Model model
    );

    @GetMapping("register")
    String registration(
            @Valid @ModelAttribute("form") UserForm form,
            BindingResult bindingResult,
            Model model
    );
    @PostMapping("register")
    String registerUser(
            @Valid @ModelAttribute("form") UserForm form,
            BindingResult bindingResult,
            Model model
    );
    @GetMapping("logout")
    String logoutConfirmation(Model model);
}
