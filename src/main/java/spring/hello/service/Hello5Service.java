package spring.hello.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.hello.model.Users;
import spring.hello.persistence.UserMapper;

@Service
public class Hello5Service implements Hello5ServiceInterface {

	@Autowired
	private UserMapper userMapper;

	@Override
	@Transactional
	public List<Users> getUserList(Users user) {
		System.out.println("hello5");
		return userMapper.selectList(user);
	}
	
}
