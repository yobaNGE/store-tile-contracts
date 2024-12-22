package org.chiches.storecherepitsacontracs.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RequestMapping("/orders")
public interface OrderController {
    @PostMapping("create")
    String createOrder(Principal principal);

    @GetMapping
    String getOrders(Principal principal, Model model);

    @GetMapping("admin")
    String getAllOrders(
            @RequestParam(required = false) String status,
            Model model
    );

    @PostMapping("admin/status/{orderId}")
    String updateOrderStatus(
            @PathVariable Long orderId,
            @RequestParam String status
    );
}
