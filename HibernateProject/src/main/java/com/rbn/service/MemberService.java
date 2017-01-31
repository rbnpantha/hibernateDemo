package com.rbn.service;

import java.util.List;

import com.rbn.domain.Member;

public interface MemberService {

	public void save(Member member);

	public List<Member> findAll();

	public Member findByMemberNumber(Integer memberId);
}
