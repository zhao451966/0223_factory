package com.jzhao.vip.factory.product.impl;

import com.jzhao.vip.factory.product.IPaymentAfter;

public class WeChatIPaymentAfter implements IPaymentAfter {
    public void deduction() {
        System.out.println("微信在支付扣款。。。。。。");
    }
}
