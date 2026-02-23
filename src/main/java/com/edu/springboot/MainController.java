package com.edu.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String main() {
		String str = "깃헙연동";
		String str_pjh = "박종현";
		String aa = "에잉에이";
		String s_snh = "성낙현";
		String s_csh = "차신해";
		return "main";
	}
}
