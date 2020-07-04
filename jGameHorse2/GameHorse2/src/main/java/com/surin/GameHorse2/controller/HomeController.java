package com.surin.GameHorse2.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	//public ModelAndView test(HttpServletResponse response) throws IOException{
	//public ModelAndView GameHorse2Controller(HttpServletResponse response) throws IOException{
	public ModelAndView GameHorse2Controller(Model model) throws IOException{		
		model.addAttribute("Header","Welcome in GameHorse2");
		return new ModelAndView("home");
	}
	
	@RequestMapping(value = "/redirectTypeGame", method = RequestMethod.GET)
	   public String redirect() {
	     
	      return "redirect:typeGame";
	   }
	
	   @RequestMapping(value = "/typeGame", method = RequestMethod.GET)
	   public String finalPage(Model model) {
		  model.addAttribute("Header","Welcome in GameHorse2");
	      return "typeGame";
	   }
}
