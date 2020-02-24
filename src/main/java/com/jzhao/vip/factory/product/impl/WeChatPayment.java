package com.jzhao.vip.factory.product.impl;

import com.jzhao.vip.factory.product.IPayment;

public class WeChatPayment implements IPayment {
    public void callPaynterface() {
        System.out.println("微信支付进行中。。。。。。");
    }
}
