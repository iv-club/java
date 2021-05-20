package kr.ac.inha.board.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// ctrl + shift + o : 사용하지 않는 import 정리
@RestController
public class BoardController {
	@RequestMapping("/hello") //hello를 요청받으면 실행
	public String hello() {
		return "hello world!!";
	}
	@RequestMapping("/inha") // 동일한 매핑이 있으면 실행이 안됨
	public String inha(String param) { // 메서드명은 상관이 없음
		return param + "inha.ac.kr";	
		// get방식은 ?로 받음
	}
	@RequestMapping("/name")
	public String name(String id) {
		return "당신의 학번은 " + id+"입니다.";	
	}
}
