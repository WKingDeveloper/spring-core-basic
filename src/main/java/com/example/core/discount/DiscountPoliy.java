package com.example.core.discount;

import com.example.core.member.Member;
import org.springframework.stereotype.Component;

public interface DiscountPoliy {

    /**
     * @return 할인 대상 금액
     */
    int discount(Member member, int price);

}
