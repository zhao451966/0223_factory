package com.jzhao.vip.factory.abstractfactory.impl;

import com.jzhao.vip.factory.abstractfactory.IPaymentFactory;
import com.jzhao.vip.factory.product.IPayment;
import com.jzhao.vip.factory.product.IPaymentBefore;
import com.jzhao.vip.factory.product.IPaymentAfter;
import com.jzhao.vip.factory.product.impl.*;

public class UnionPayPaymentFactory implements IPaymentFactory {

    public IPaymentBefore createPaymentBefore() {
        return new UnionPayPaymentBefore();
    }

    public IPayment createPayment() {
        return new UnionPayPayment();
    }

    public IPaymentAfter createPaymentAfter() {
        return new UnionPayPaymentAfter();
    }
}
