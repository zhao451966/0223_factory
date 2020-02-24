package com.jzhao.vip.factory.abstractfactory;

import com.jzhao.vip.factory.product.INetworkAcceleration;

/**
 * 国内支付抽象工厂
 */
public interface IAbroadPaymentFactory extends IPaymentFactory{
    //网络加速
    INetworkAcceleration createNetworkAcceleration();
}
