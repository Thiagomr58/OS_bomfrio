package br.com.OS_bomfrio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/")
public class HomeController {
	

	@GetMapping // será carregado instataneamente quando for digitado /vinhos
	public ModelAndView pesquisar() {
		ModelAndView mv = new ModelAndView("home/home");
		
		return mv;
	}

}
