package com.example.demo.restfulMenu;

import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class TestRESTController {
	
	/* @PathVariable
	 * uri path 에서 데이터 추출
	 * https://www.baeldung.com/spring-pathvariable
	 * https://velog.io/@jcinsh/Query-string-path-variable 
	*/
	
	/* 경로변수와 사용할 변수명을 같게 할 때 */
	@GetMapping("/{id}")
	public String getHttpMethodAlike(@PathVariable String id) {
		return id;
	};
	
	/* 경로변수와 사용할 변수명을 다르게 할 때 */
//	@GetMapping("/{id}")
//	public String getHttpMethodDiff(@PathVariable("id") String userId) {
//		return userId;
//	};
	
	/* map으로 받기 */
//	@GetMapping("/{id}/{password}")
//	public Map<String, String> getHttpMethodMap(@PathVariable Map<String, String> pathVarsMap) {
//		return pathVarsMap;
//	};
	
	/* @requestParam
	 * query string에서 데이터 추출
	 * https://www.baeldung.com/spring-request-param
	*/
	
//	@GetMapping
//	public String getHttpMethodQuery(
//			@RequestParam(value = "id", defaultValue = "아이디없음", required = false)String id) 
//	{
//		return id;
//	};
		
	// 삭제
	@DeleteMapping("/{id}")
	public void getHttpMethodMapDel(@PathVariable String id) {
		System.out.println("내가 지울 아이디는 : "+id);
	};
	
	@PutMapping("/{id}")
	public String getHttpMethodMapPut(@PathVariable String id) {
		String str 		= "";
		String userId 	= "코딩천ㅈrl";
		userId 			= id;
		str				= "원래 아이디는 : '코딩천ㅈrl', 변경할 아이디는 : '"+userId+"'";
		return str;
	};
	
	/* @RequestBody
	 * post는 객체에 데이터를 담아 보낸다. 
	 * https://memostack.tistory.com/162
	 * https://tecoble.techcourse.co.kr/post/2021-05-11-requestbody-modelattribute/
	*/
	
	@PostMapping
	public Map<String, String> getHttpMethodPost(@RequestBody Map<String, String> pathVarsMap) {
		return pathVarsMap;
	}; 

}
