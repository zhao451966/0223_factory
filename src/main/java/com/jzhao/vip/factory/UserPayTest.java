package com.jzhao.vip.factory;

import com.jzhao.vip.factory.abstractfactory.impl.AlipayPaymentFactory;
import com.jzhao.vip.factory.abstractfactory.IPaymentFactory;
import com.jzhao.vip.factory.abstractfactory.impl.BankAbroadPaymentFactory;
import com.jzhao.vip.factory.abstractfactory.impl.UnionPayPaymentFactory;
import com.jzhao.vip.factory.abstractfactory.impl.WeChatPaymentFactory;

public class UserPayTest {
    public static void main(String[] args) {
        IPaymentFactory payment = new AlipayPaymentFactory();
        //支付宝工厂支付
        payment.createPaymentBefore().checkInfo();
        payment.createPayment().callPaynterface();
        payment.createPaymentAfter().deduction();
        System.out.println();
        //微信工厂支付
        payment = new WeChatPaymentFactory();
        payment.createPaymentBefore().checkInfo();
        payment.createPayment().callPaynterface();
        payment.createPaymentAfter().deduction();
        System.out.println();
        //银联工厂支付
        payment = new UnionPayPaymentFactory();
        payment.createPaymentBefore().checkInfo();
        payment.createPayment().callPaynterface();
        payment.createPaymentAfter().deduction();
        System.out.println();
        //境外银行支付
        payment = new BankAbroadPaymentFactory();
        ((BankAbroadPaymentFactory) payment).createNetworkAcceleration().acceleratingNetwork();
        payment.createPaymentBefore().checkInfo();
        payment.createPayment().callPaynterface();
        payment.createPaymentAfter().deduction();
    }
}
