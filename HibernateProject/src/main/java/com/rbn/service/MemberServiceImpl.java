package com.rbn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rbn.dao.MemberDao;
import com.rbn.domain.Member;


@Service
@Transactional 
public class MemberServiceImpl implements MemberService {
	
 	@Autowired
	private MemberDao memberDao;

 /*   @Autowired
    public void setDao( GenericDao<MemberDao> memberDao ){
    	this.memberDao = memberDao;
    	memberDao.setDaoType(Member.class);
    }

*/ 	
     public void save( Member member) {  		
  		memberDao.save(member);
 	}
  	
  	
	public List<Member> findAll() {
		return (List<Member>)memberDao.findAll();
	}

	public Member findByMemberNumber(Integer memberId) {
		return memberDao.findByMemberNumber(memberId);
	}
 

}

