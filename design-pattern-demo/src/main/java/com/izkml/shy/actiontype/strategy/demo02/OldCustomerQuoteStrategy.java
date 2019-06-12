package com.izkml.shy.actiontype.strategy.demo02;

import java.math.BigDecimal;

/**
 * @author: shy
 * @description: 老顾客价格策略实现类
 * @create: 2019-06-12 10:20
 **/

public class OldCustomerQuoteStrategy implements IQuoteStrategy {
    @Override
    public BigDecimal getPrice(BigDecimal originalPrice) {
        System.out.println("恭喜！老客户享有9折优惠！");
        originalPrice = originalPrice.multiply(new BigDecimal(0.9)).setScale(2,BigDecimal.ROUND_HALF_UP);
        return originalPrice;
    }
}
