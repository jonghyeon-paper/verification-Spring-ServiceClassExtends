package spring.hello.service;

import java.util.List;

public abstract class Hello4ServiceAbstract<T> implements Hello4ServiceInterface<T> {

	public abstract List<T> getUserList(T object);
}
