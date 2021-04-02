package com.spring.example;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	@Autowired
	private SqlSession sqlSession;
	
	public List<MemberVO> selectAllMembers() {
		List<MemberVO> result = sqlSession.selectList("selectAllMembers");
		return result;
	}
}
