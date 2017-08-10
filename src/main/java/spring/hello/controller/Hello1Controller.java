package spring.hello.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import spring.hello.service.Hello1Service;

@RestController
@RequestMapping("/hello1")
public class Hello1Controller {
	
	@Autowired
	private Hello1Service hello1Service;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<?> getUserList() {
		return hello1Service.getUserList();
	}

}
