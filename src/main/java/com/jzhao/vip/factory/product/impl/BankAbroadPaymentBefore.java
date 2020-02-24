package com.jzhao.vip.factory.product.impl;

import com.jzhao.vip.factory.product.IPaymentBefore;

public class BankAbroadPaymentBefore implements IPaymentBefore {
    public void checkInfo() {
        System.out.println("境外银行支付前信息校验中。。。。。。");
    }
}
