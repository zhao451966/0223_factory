package com.jzhao.vip.factory.abstractfactory.impl;

import com.jzhao.vip.factory.abstractfactory.IPaymentFactory;
import com.jzhao.vip.factory.product.IPayment;
import com.jzhao.vip.factory.product.IPaymentBefore;
import com.jzhao.vip.factory.product.IPaymentAfter;
import com.jzhao.vip.factory.product.impl.*;

public class WeChatPaymentFactory implements IPaymentFactory {

    public IPaymentBefore createPaymentBefore() {
        return new WeChatPaymentBefore();
    }

    public IPayment createPayment() {
        return new WeChatPayment();
    }

    public IPaymentAfter createPaymentAfter() {
        return new WeChatPaymentAfter();
    }
}
