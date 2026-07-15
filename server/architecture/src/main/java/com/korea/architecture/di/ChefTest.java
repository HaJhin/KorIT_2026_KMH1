package com.korea.architecture.di;

import org.springframework.beans.factory.annotation.Autowired;


public class ChefTest {
	
	// 프로젝트를 실행하면 스프링부트가 만들어놓은 객체를 변수에 주입해준다.
	@Autowired
	Chef chef;
	
	public void chefTest() {
		chef.cook();
	}
}
