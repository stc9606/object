package com.java.chapter2.policy;

import com.java.chapter2.Money;
import com.java.chapter2.screen.Screening;

public class NoneDefaultDiscountPolicy implements DiscountPolicy {

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
