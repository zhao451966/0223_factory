package com.jzhao.vip.factory.abstractfactory.impl;

import com.jzhao.vip.factory.abstractfactory.IAbroadPaymentFactory;
import com.jzhao.vip.factory.product.INetworkAcceleration;
import com.jzhao.vip.factory.product.IPayment;
import com.jzhao.vip.factory.product.IPaymentBefore;
import com.jzhao.vip.factory.product.IPaymentAfter;
import com.jzhao.vip.factory.product.impl.BankAbroadNetworkAcceleration;
import com.jzhao.vip.factory.product.impl.BankAbroadPayment;
import com.jzhao.vip.factory.product.impl.BankAbroadPaymentAfter;
import com.jzhao.vip.factory.product.impl.BankAbroadPaymentBefore;

public class BankAbroadPaymentFactory implements IAbroadPaymentFactory {
    public INetworkAcceleration createNetworkAcceleration() {
        return new BankAbroadNetworkAcceleration();
    }
    public IPaymentBefore createPaymentBefore() {
        return new BankAbroadPaymentBefore();
    }

    public IPayment createPayment() {
        return new BankAbroadPayment();
    }

    public IPaymentAfter createPaymentAfter() {
        return new BankAbroadPaymentAfter();
    }
}
