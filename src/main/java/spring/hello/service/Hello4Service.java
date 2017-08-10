package spring.hello.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.hello.model.Users;
import spring.hello.persistence.UserMapper;

@Service
public class Hello4Service extends Hello4ServiceAbstract<Users> {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<Users> getUserList() {
		System.out.println("hello4");
		return userMapper.selectList(new Users());
	}
	
}
