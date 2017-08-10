package spring.hello.persistence;

import java.util.List;

import spring.hello.model.Users;

public interface UserMapper {

	List<Users> selectList(Users users);
	Users selectOne(Users users);
}
