package com.java.chapter2.policy;

import com.java.chapter2.Money;
import com.java.chapter2.condition.DiscountCondition;
import com.java.chapter2.screen.Screening;

public class AmountDefaultDiscountPolicy extends DefaultDiscountPolicy {

    private Money discountAmount;

    public AmountDefaultDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
