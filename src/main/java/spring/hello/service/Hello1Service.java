package spring.hello.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.hello.model.Users;
import spring.hello.persistence.UserMapper;

@Service
public class Hello1Service {

	@Autowired
	private UserMapper userMapper;
	
	public List<Users> getUserList() {
		System.out.println("hello1");
		return userMapper.selectList(new Users());
	}
	
	public List<String> getUserRoleList(String userId) {
		return userMapper.selectRoleList(userId);
	}
	
}
