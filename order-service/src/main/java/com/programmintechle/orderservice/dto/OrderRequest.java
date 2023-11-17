package com.programmintechle.orderservice.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderRequest {

    private List<OrderLineItemsDto> orderLineItemsDtoList;
}
