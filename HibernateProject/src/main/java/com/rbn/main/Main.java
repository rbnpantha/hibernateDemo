package com.rbn.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rbn.domain.Member;
import com.rbn.service.MemberService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		MemberService memberService = (MemberService) ctx.getBean("memberServiceImpl");

		List<Member> list = memberService.findAll();
		System.out.println("Member count: " + list.size());

		Member member1 = new Member();
		member1.setFirstName("Rabin");
		member1.setLastName("Pantha");
		member1.setMemberNumber(1);
		memberService.save(member1);
		System.out.println("Member1 inserted!");
		Member member2 = new Member();
		member2.setFirstName("Sabin");
		member2.setLastName("Subedi");
		member2.setMemberNumber(2);
		memberService.save(member2);
		System.out.println("Member2 inserted!");

		list = memberService.findAll();
		System.out.println("Member count: " + list.size());

		Member readMember = memberService.findByMemberNumber(1);

		System.out.println();
		System.out.println("        *********  MEMBER **********");

		System.out.println("Member Name: " + readMember.getFirstName() + " " + readMember.getLastName());

		List<Member> readMemberList = memberService.findAll();

		System.out.println();
		System.out.println("        *********  MEMBER List**********");

		for (Member member : readMemberList) {
			System.out.println("Member Name: " + member.getFirstName() + " " + member.getLastName());
		}
	}
}
