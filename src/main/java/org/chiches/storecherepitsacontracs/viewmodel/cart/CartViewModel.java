package org.chiches.storecherepitsacontracs.viewmodel.cart;

import java.util.List;

public record CartViewModel(
        List<CartItemViewModel> items,
        Long totalPrice
) {}
