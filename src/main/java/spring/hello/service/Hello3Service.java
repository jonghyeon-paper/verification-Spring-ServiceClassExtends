package spring.hello.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.hello.model.Users;
import spring.hello.persistence.UserMapper;

@Service
public class Hello3Service extends Hello3ServiceAbstract<Users> {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<Users> getUserList(Users user) {
		System.out.println("hello3");
		return userMapper.selectList(new Users());
	}

}
