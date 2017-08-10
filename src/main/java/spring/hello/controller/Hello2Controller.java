package spring.hello.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import spring.hello.model.Users;
import spring.hello.service.Hello2ServiceInterface;

@RestController
@RequestMapping("/hello2")
public class Hello2Controller {
	
	@Autowired
	private Hello2ServiceInterface hello2Service;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<Users> getUserList() {
		return hello2Service.getUserList(new Users());
	}

}
