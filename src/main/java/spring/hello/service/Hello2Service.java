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
	public List<Users> getUserList() {
		return userMapper.selectList(new Users());
	}

	@Override
	public List<String> getUserRoleList(String userId) {
		return userMapper.selectRoleList(userId);
	}

}
