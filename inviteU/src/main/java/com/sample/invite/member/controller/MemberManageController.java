package com.sample.invite.member.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.invite.member.dto.MemberDto;

@RestController
@RequestMapping("/member")
public class MemberManageController {
	
	@PostMapping("/check")
	public MemberDto postMember(@RequestBody MemberDto memberDto) {
		MemberDto fixDto = new MemberDto();
		fixDto.setEmail("random@gmail.com");
		fixDto.setName("jane doe");
		fixDto.setPhone("01030436474");
		
		return fixDto;
	}
	
}
