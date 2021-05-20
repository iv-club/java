package kr.ac.inha.board.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// ctrl + shift + o : 사용하지 않는 import 정리
@RestController
public class BoardController {
	@RequestMapping("/hello") //hello를 요청받으면 실행
	public String hello(String num) {
		return num+"*1=2"+" "+num+"*2=4"+" "+num+"*3=6"+" "+num+"*4=8"+" "+num+"*5=10"+" "+num+"*6=12"+" "+num+"*7=14"+" "+num+"*8=16"+" "+num+"*9=18";	
	}
}
