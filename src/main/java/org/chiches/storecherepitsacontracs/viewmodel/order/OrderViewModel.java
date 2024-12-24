package org.chiches.storecherepitsacontracs.viewmodel.order;

import java.time.LocalDateTime;

public record OrderViewModel(
        Long id,
        LocalDateTime orderDate,
        String status,
        Long totalPrice,
        List<OrderItemViewModel> orderItems
) {}
