package com.jzhao.vip.factory.abstractfactory.impl;

import com.jzhao.vip.factory.abstractfactory.IPaymentFactory;
import com.jzhao.vip.factory.product.IPayment;
import com.jzhao.vip.factory.product.IPaymentBefore;
import com.jzhao.vip.factory.product.IPaymentAfter;
import com.jzhao.vip.factory.product.impl.AlipayPayment;
import com.jzhao.vip.factory.product.impl.AlipayIPaymentBefore;
import com.jzhao.vip.factory.product.impl.AlipayIPaymentAfter;

public class AlipayPaymentFactory implements IPaymentFactory {

    public IPaymentBefore createPaymentBefore() {
        return new AlipayIPaymentBefore();
    }

    public IPayment createPayment() {
        return new AlipayPayment();
    }

    public IPaymentAfter createPaymentAfter() {
        return new AlipayIPaymentAfter();
    }
}
