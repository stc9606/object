package com.java.chapter2.condition;

import com.java.chapter2.screen.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
