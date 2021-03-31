package com.axis;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@RequestMapping("/hello")
	public ModelAndView helloWorld() {
		String message="Hi There! Welcome to spring training!";
		return new ModelAndView("hellopage","message",message);
	}
}
