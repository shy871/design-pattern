package com.izkml.shy.actiontype.strategy.demo02;

import java.math.BigDecimal;

/**
 * @author: shy
 * @description: 策略报价上下文类
 * @create: 2019-06-12 10:22
 **/

public class QuoteContext {

    //持有一个具体的报价策略
    private IQuoteStrategy quoteStrategy;

    //注入报价策略
    public QuoteContext(IQuoteStrategy quoteStrategy) {
        this.quoteStrategy = quoteStrategy;
    }

    //回调具体报价策略的方法
    public BigDecimal getPrice(BigDecimal originalPrice) {
        return quoteStrategy.getPrice(originalPrice);
    }

}
