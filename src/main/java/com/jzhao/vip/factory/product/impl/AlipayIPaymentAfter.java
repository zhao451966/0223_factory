package com.jzhao.vip.factory.product.impl;

import com.jzhao.vip.factory.product.IPaymentAfter;

public class AlipayIPaymentAfter implements IPaymentAfter {
    public void deduction() {
        System.out.println("支付宝在支付扣款。。。。。。");
    }
}
