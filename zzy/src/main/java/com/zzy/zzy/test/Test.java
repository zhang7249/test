package com.zzy.zzy.test;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/test11")
public class Test {
	
	@RequestMapping(value="/test22",method=RequestMethod.GET)
	public String test() {
		
	System.out.println("--------------------------------------------hahaaha---------------");
		return "helloWorld--";
	}

}
