package com.example.bulletin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bulletin/")
public class BulletinController {

	@GetMapping("/exmpl")
	public String Example(){
		return "/bulletin/exmpl";
	}
}
