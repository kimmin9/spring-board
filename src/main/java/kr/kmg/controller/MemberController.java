package kr.kmg.controller;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.kmg.dao.MemberDao;
import kr.kmg.vo.Member;

@Controller
public class MemberController {
	
	@Autowired
	private MemberDao dao;
	
	@RequestMapping(value = "/join", method= RequestMethod.GET)
	public String join() {
		return "join";
	}
	
	@RequestMapping(value = "/join/ok")
	public void MemberController(@ModelAttribute Member mem) {
		if(mem != null) {
			dao.insertmember(mem); // 서비스로 변경 
		}		
		
	}

}
