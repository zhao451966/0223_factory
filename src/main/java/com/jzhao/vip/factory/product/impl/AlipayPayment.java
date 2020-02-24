package com.jzhao.vip.factory.product.impl;

import com.jzhao.vip.factory.product.IPayment;

public class AlipayPayment implements IPayment {
    public void callPaynterface() {
        System.out.println("支付宝支付进行中。。。。。。");
    }
}
