package spring.hello.element;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import spring.configuration.StoredValue;

public enum UsersGender {
	
	MALE("M", 1), FEMALE("F", 2);
	
	private UsersGender(String storedValue, Integer codeValue) {
		this.storedValue = storedValue;
		this.codeValue = codeValue;
	}
	
	private String storedValue;
	
	private Integer codeValue;

	@StoredValue
	public String getStoredValue() {
		return storedValue;
	}

	public Integer getCodeValue() {
		return codeValue;
	}
	
	@JsonValue
	public Map<String, String> getJsonValue() {
		Map<String, String> data = new HashMap<>();
		data.put("name", this.name());
		return data;
	}
	
	@JsonCreator
	public static UsersGender createJsonValue(String name) {
		for (UsersGender item : UsersGender.class.getEnumConstants()) {
			if (name.equalsIgnoreCase(item.name())) {
				return item;
			}
		}
		return null;
	}

}
