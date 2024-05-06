package com.java.chapter2.policy;

import com.java.chapter2.Money;
import com.java.chapter2.condition.DiscountCondition;
import com.java.chapter2.screen.Screening;

public class PercentDefaultDiscountPolicy extends DefaultDiscountPolicy {

    private double percent;

    public PercentDefaultDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
