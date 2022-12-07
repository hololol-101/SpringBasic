package hello.core.discount;

import hello.core.member.GRADE;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmount = 1000;


    @Override
    public int discount(Member member, int price) {
        if(member.getGrade()== GRADE.VIP){
            return discountFixAmount;
        }
        return 0;
    }
}
