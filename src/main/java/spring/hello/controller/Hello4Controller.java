package spring.hello.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import spring.hello.model.Users;
import spring.hello.service.Hello4Service;

@RestController
@RequestMapping("/hello4")
public class Hello4Controller {
	
	@Autowired
	private Hello4Service hello4Service;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<Users> getUserList() {
		return hello4Service.getUserList(new Users());
	}

}
