package com.jzhao.vip.factory.product.impl;

import com.jzhao.vip.factory.product.IPaymentAfter;

public class UnionPayIPaymentAfter implements IPaymentAfter {
    public void deduction() {
        System.out.println("银联在支付扣款。。。。。。");
    }
}
