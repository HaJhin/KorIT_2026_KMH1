package com.korea.architecture;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.korea.architecture.message.MemberService;

@SpringBootTest
public class MemberServiceTest {
	
	@Autowired
	private MemberService memberService;
	
	@Test
	public void memberJoinTest() {
		memberService.joinMember("김민수");
	}
}
