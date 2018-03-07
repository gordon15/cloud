/**
 * 
 */
package com.gbsports.cloud.member.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 *
 */
@RestController
public class HelloWorld {
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String sayHello(){
		return "hello";
	}
}
