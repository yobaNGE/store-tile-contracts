package org.chiches.storecherepitsacontracs.viewmodel.order;

import java.time.LocalDateTime;
import java.util.List;

public record AdminOrderViewModel(
        Long id,
        LocalDateTime orderDate,
        String status,
        Long totalPrice,
        String username,  // or a nested record
        List<OrderItemViewModel> orderItems
) {}