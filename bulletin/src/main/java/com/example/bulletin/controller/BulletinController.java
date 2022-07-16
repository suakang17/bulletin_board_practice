package com.example.bulletin.controller;

import com.example.bulletin.service.BulletinService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bulletin/")
@RequiredArgsConstructor
public class BulletinController {

	private final BulletinService service;
	@GetMapping("/exmpl")
	public String Example(){
		return "/bulletin/exmpl";
	}

	@GetMapping("/test")
	public String test(Model model){
		model.addAttribute("cnt", service.bulletinCount());
		model.addAttribute("test", service.bulletinList());

		return "/bulletin/exmpl";
	}

	@GetMapping("/main")
	public String main(Model model){
		model.addAttribute("list", service.bulletinList());
		return "/bulletin/main";
	}

	@GetMapping("/post")
	public String viewPost(Model model, Long bulletinId) {
		model.addAttribute("post", service.getPost(bulletinId));
		return "/bulletin/post";
	}
}
