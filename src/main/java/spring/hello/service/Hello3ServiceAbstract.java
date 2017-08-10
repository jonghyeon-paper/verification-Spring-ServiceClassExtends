package spring.hello.service;

import java.util.List;

import spring.hello.model.Users;

public abstract class Hello3ServiceAbstract {

	public abstract List<Users> getUserList();
	public abstract List<String> getUserRoleList(String userId);
}
