package com.example.core.order;

import com.example.core.discount.DiscountPoliy;
import com.example.core.discount.FixDiscountPoliy;
import com.example.core.discount.RateDiscountPolicy;
import com.example.core.member.Member;
import com.example.core.member.MemberRepository;
import com.example.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository;
    private final DiscountPoliy discountPoliy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPoliy discountPoliy) {
        this.memberRepository = memberRepository;
        this.discountPoliy = discountPoliy;
    }

    //    private final MemberRepository memberRepository = new MemoryMemberRepository();
//    private final DiscountPoliy discountPoliy = new FixDiscountPoliy();
//    private final DiscountPoliy discountPoliy = new RateDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPoliy.discount(member, itemPrice);

        return new Order(memberId,itemName,itemPrice,discountPrice);
    }

}
