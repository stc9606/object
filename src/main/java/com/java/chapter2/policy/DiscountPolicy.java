package com.java.chapter2.policy;

import com.java.chapter2.Money;
import com.java.chapter2.screen.Screening;

public interface DiscountPolicy {

    public Money calculateDiscountAmount(Screening screening);

}
