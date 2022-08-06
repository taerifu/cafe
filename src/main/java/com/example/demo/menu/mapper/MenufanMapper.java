package com.example.demo.menu.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.example.demo.menu.vo.MenuVo;


@Mapper
@Repository
public interface MenufanMapper {

	List<HashMap<String, Object>> selectMenuByList();
	
	HashMap<String, Object> selectMenuByMap(int menuId);
	
	HashMap<String, Object> selectMenuByCustomMap(int menuId);
	
	// mybatis에서 제공하는 어노테이션을 사용하여 mapper interface에서 쿼리 실행하기. 
	// 간단한 쿼리 실행에만 사용을 권장한다.
	@Select("SELECT * FROM TB_MENU_INFO")
	List<HashMap<String, Object>> selectMenuByListLikeISaid();
	
	MenuVo selectMenuVo(int menuId);
	
}
