package com.jzhao.vip.factory.product.impl;

import com.jzhao.vip.factory.product.IPaymentAfter;

public class BankAbroadPaymentAfter implements IPaymentAfter {
    public void deduction() {
        System.out.println("境外银行在支付扣款。。。。。。");
    }
}
