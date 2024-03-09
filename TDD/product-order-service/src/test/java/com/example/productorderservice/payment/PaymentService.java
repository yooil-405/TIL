package com.example.productorderservice.payment;

import com.example.productorderservice.order.Order;

class PaymentService {
    private final PaymentPort paymentPort;

    PaymentService(PaymentPort paymentPort) {
        this.paymentPort = paymentPort;
    }

    public void payment(PaymentRequest request) {
        Order order = paymentPort.getOrder(request.orderId());

        Payment payment = new Payment(order, request.cardNumber());

        paymentPort.pay(payment.getPricae(), payment.getCardNumber());
        paymentPort.save(payment);
    }
}
