package com.example.core.discount;

import com.example.core.member.Member;

public interface DiscountPoliy {

    /**
     * @return 할인 대상 금액
     */
    int discount(Member member, int price);

}
