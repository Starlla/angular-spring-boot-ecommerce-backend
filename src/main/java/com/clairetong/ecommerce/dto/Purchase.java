package com.clairetong.ecommerce.dto;


import com.clairetong.ecommerce.entity.Address;
import com.clairetong.ecommerce.entity.Customer;
import com.clairetong.ecommerce.entity.Order;
import com.clairetong.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
