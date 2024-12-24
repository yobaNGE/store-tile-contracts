package org.chiches.storecherepitsacontracs.viewmodel.cart;

public record CartViewModel(
        List<CartItemViewModel> items,
        Long totalPrice
) {}
