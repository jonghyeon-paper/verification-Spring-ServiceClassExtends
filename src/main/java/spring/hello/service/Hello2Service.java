package spring.hello.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.hello.model.Users;
import spring.hello.persistence.UserMapper;

@Service
public class Hello2Service implements Hello2ServiceInterface {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<Users> getUserList(Users user) {
		System.out.println("hello2");
		return userMapper.selectList(user);
	}

}
