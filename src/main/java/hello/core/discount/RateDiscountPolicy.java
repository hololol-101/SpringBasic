package hello.core.discount;

import hello.core.member.GRADE;
import hello.core.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {
    private int discountRate = 10;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == GRADE.VIP){
            return price * discountRate / 100;
        }else{
            return 0;
        }

    }
}
