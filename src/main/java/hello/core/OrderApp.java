package hello.core;

import hello.core.member.GRADE;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();

        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();
        
        Long memberId = 1L;
        Member member = new Member(memberId, "MemberA", GRADE.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "ItemA", 20000);

        System.out.println("order = " + order);
        System.out.println("order.getDiscountPrice() = " + order.getDiscountPrice());
    }
}
