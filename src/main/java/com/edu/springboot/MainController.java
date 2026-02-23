package com.edu.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String main() {
		String str = "깃헙연동";
		String str_ksb = "김수빈";
		String aa = "에잉에이";
		String s_snh = "성낙현";
		return "main";
	}
}






