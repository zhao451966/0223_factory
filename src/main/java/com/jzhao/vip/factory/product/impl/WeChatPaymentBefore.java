package com.jzhao.vip.factory.product.impl;

import com.jzhao.vip.factory.product.IPaymentBefore;

public class WeChatPaymentBefore implements IPaymentBefore {
    public void checkInfo() {
        System.out.println("微信支付前信息校验中。。。。。。");
    }
}
