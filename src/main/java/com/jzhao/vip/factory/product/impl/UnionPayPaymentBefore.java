package com.jzhao.vip.factory.product.impl;

import com.jzhao.vip.factory.product.IPaymentBefore;

public class UnionPayPaymentBefore implements IPaymentBefore {
    public void checkInfo() {
        System.out.println("银联支付前信息校验中。。。。。。");
    }
}
