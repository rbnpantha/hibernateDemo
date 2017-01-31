package com.rbn.dao;

import com.rbn.domain.Member;

public interface MemberDao extends GenericDao<Member> {
    
	public Member findByMemberNumber(Integer number);
}
