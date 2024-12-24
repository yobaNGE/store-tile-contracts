package org.chiches.storecherepitsacontracs.viewmodel.order;

import java.time.LocalDateTime;
import java.util.List;

public record OrderViewModel(
        Long id,
        LocalDateTime orderDate,
        String status,
        Long totalPrice,
        List<OrderItemViewModel> orderItems
) {}
