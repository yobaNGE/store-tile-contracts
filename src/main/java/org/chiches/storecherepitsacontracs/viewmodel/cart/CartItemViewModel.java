package org.chiches.storecherepitsacontracs.viewmodel.cart;

public record CartItemViewModel(
        Long tileId,
        String tileName,
        Long price,
        int quantity
) {}