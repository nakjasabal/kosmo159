package com.edu.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String main() {
		String str = "깃헙연동";
<<<<<<< HEAD
		String str_peh = "박은혁";
=======
		String aa = "에잉에이";
>>>>>>> branch 'main' of https://github.com/nakjasabal/kosmo159.git
		String s_snh = "성낙현";
		return "main";
	}
}






