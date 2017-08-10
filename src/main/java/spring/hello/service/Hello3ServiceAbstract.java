package spring.hello.service;

import java.util.List;

public abstract class Hello3ServiceAbstract<T> {

	public abstract List<T> getUserList(T object);
}
