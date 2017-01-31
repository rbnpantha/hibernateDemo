package com.rbn.doaImpl;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import com.rbn.dao.MemberDao;
import com.rbn.domain.Member;
@SuppressWarnings("unchecked")
@Repository
public class MemberDaoImpl extends GenericDaoImpl<Member> implements MemberDao {

	public MemberDaoImpl() {
		super.setDaoType(Member.class);
	}

	public Member findByMemberNumber(Integer number) {

		Query query = entityManager.createQuery("select m from MEMBER m  where m.memberNumber =:number");
		return (Member) query.setParameter("number", number).getSingleResult();

	}

}