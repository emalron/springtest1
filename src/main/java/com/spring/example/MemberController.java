package com.spring.example;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="/list.do", method=RequestMethod.GET)
	public String listMembers(Model model, HttpServletRequest request, HttpServletResponse response) {
		List<MemberVO> list = memberService.listMembers();
		model.addAttribute("list", list);
		return "/member/listMembers";
	}

}
