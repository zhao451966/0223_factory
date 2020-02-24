package com.jzhao.vip.factory.abstractfactory;

import com.jzhao.vip.factory.product.IPayment;
import com.jzhao.vip.factory.product.IPaymentBefore;
import com.jzhao.vip.factory.product.IPaymentAfter;

/**
 * 国内支付抽象工厂
 */
public interface IPaymentFactory {

    //支付前：
    IPaymentBefore createPaymentBefore();
    //支付中：
    IPayment createPayment();
    //支付后：
    IPaymentAfter createPaymentAfter();
}
