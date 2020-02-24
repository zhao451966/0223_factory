package com.jzhao.vip.factory.product.impl;

import com.jzhao.vip.factory.product.IPaymentBefore;

public class AlipayIPaymentBefore implements IPaymentBefore {
    public void checkInfo() {
        System.out.println("支付宝支付前信息校验中。。。。。。");
    }
}
