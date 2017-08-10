package spring.hello.service;

import java.util.List;

import spring.hello.model.Users;

public interface Hello2ServiceInterface {

	List<Users> getUserList();
	List<String> getUserRoleList(String userId);
}
