package spring.hello.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import spring.hello.model.Users;

public interface UserMapper {

	List<Users> selectList(Users users);
	
	Users selectOne(Users users);
	Users selectOne(@Param("userId") String userId);
	
	void insert(List<Users> users);
	
	void update(Users users);
	
	void delete(Users users);
	void dlelteByPk(@Param("userId") String userId);
	
	List<String> selectRoleList(@Param("userId") String userId);
}
