package com.spring.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	@Autowired
	private MemberDAO memberDAO;
	
	public List<MemberVO> listMembers() {
		List<MemberVO> result = memberDAO.selectAllMembers();
		return result;
	}

}
