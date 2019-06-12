package com.izkml.shy.actiontype.strategy.demo02;

import java.math.BigDecimal;

/**
 * @author: shy
 * @description: 新顾客价格策略实现类
 * @create: 2019-06-12 10:19
 **/

public class NewCustomerQuoteStrategy implements IQuoteStrategy{
    @Override
    public BigDecimal getPrice(BigDecimal originalPrice) {
        System.out.println("抱歉！新客户没有折扣！");
        return originalPrice;
    }
}
