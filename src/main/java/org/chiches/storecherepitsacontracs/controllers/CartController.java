package org.chiches.storecherepitsacontracs.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RequestMapping("/cart")
public interface CartController {

    @GetMapping
    String viewCart(Principal principal, Model model);


    @PostMapping("/add")
    String addItem(
            Principal principal,
            @RequestParam Long tileId,
            @RequestParam Integer quantity
    );


    @PostMapping("/remove")
    String removeItem(
            Principal principal,
            @RequestParam Long tileId
    );

    @PostMapping("/clear")
    String clearCart(Principal principal);

    @PostMapping("/update")
    String updateItemQuantity(
            Principal principal,
            @RequestParam Long tileId,
            @RequestParam Integer quantity
    );

}
