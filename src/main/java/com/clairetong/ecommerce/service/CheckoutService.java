package com.clairetong.ecommerce.service;

import com.clairetong.ecommerce.dto.Purchase;
import com.clairetong.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
