package org.chiches.storecherepitsacontracs.viewmodel.order;

public record OrderItemViewModel(
        Long tileId,
        String tileName,
        Long price,
        int quantity
) {}
