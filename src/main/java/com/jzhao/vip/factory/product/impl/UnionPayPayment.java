package com.jzhao.vip.factory.product.impl;

import com.jzhao.vip.factory.product.IPayment;

public class UnionPayPayment implements IPayment {
    public void callPaynterface() {
        System.out.println("银联支付进行中。。。。。。");
    }
}
