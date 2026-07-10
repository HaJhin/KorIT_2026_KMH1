package com.example.demo.dependency.qualifier;

import org.springframework.stereotype.Component;

@Component("laptop")
public interface Computer {
	
	public int getScreenWidth();
}
