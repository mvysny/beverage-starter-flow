package com.vaadin.starter.beveragebuddy.ui.views.reviewslist;

import com.vaadin.starter.beveragebuddy.backend.Review;

/**
 * @author mavi
 */
public class ReviewWithFoo extends Review  {
    private Long foo;

    public Long getFoo() {
        return foo;
    }

    public void setFoo(Long foo) {
        this.foo = foo;
    }
}
