package com.example.demo.menu.vo;

import java.util.HashMap;

import org.springframework.jdbc.support.JdbcUtils;

public class CustomMap extends HashMap<String, Object> {
	
	@Override
	public Object put(String key, Object value) {
        return super.put(JdbcUtils.convertUnderscoreNameToPropertyName(key), value);
    }
	
}
