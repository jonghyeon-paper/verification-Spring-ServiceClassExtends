package spring.hello.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import spring.hello.model.Users;
import spring.hello.service.Hello5Service;

@RestController
@RequestMapping("/hello5")
public class Hello5Controller {
	
	@Autowired
//	private Hello5ServiceInterface hello5Service;
	private Hello5Service hello5Service;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<Users> getUserList() {
		return hello5Service.getUserList(new Users());
	}

}
