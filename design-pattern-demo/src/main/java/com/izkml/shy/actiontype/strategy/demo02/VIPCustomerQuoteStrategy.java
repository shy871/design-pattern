package com.izkml.shy.actiontype.strategy.demo02;

import java.math.BigDecimal;

/**
 * @author: shy
 * @description: vip客户价格策略实现类
 * @create: 2019-06-12 10:21
 **/

public class VIPCustomerQuoteStrategy implements IQuoteStrategy {
    @Override
    public BigDecimal getPrice(BigDecimal originalPrice) {
        System.out.println("恭喜！VIP客户享有8折优惠！");
        originalPrice = originalPrice.multiply(new BigDecimal(0.8)).setScale(2,BigDecimal.ROUND_HALF_UP);
        return originalPrice;
    }
}
