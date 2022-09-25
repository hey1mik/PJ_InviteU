package com.sample.invite.member.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.invite.member.dto.MemberDto;

@RestController
@RequestMapping("/user")
public class UserManageController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@PostMapping("/check")
	public MemberDto postMember(@RequestBody MemberDto memberDto) {
		
		logger.info("input값 확인 : {}", memberDto.toString());
		
		MemberDto fixDto = new MemberDto();
		fixDto.setEmail("random@gmail.com");
		fixDto.setName("jane doe");
		fixDto.setPhone("01030436474");
		
		return fixDto;
	}
	
}
