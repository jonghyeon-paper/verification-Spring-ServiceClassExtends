package spring.hello.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import spring.hello.service.Hello3Service;

@RestController
@RequestMapping("/hello3")
public class Hello3Controller {
	
	@Autowired
	private Hello3Service hello3Service;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<?> getUserList() {
		return hello3Service.getUserList();
	}

}
