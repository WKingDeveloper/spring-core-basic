package com.example.core.discount;

import com.example.core.member.Grade;
import com.example.core.member.Member;

public class FixDiscountPoliy implements  DiscountPoliy{

    private int discountFixAmount = 1000; // 1000원 할인

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
