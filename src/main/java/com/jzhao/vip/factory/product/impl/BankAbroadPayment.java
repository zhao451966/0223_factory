package com.jzhao.vip.factory.product.impl;

import com.jzhao.vip.factory.product.IPayment;

public class BankAbroadPayment implements IPayment {
    public void callPaynterface() {
        System.out.println("境外银行支付进行中。。。。。。");
    }
}
