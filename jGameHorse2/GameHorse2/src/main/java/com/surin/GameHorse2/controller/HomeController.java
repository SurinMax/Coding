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
	   
	   @RequestMapping(value = "/redirectGame5x5", method = RequestMethod.GET)
	   public String redirect5x5() {
		   return "redirect:game5x5";
	   }
	   
	   @RequestMapping(value = "/game5x5", method = RequestMethod.GET)
	   public String game5x5(Model model) {
		  model.addAttribute("Header","Welcome in GameHorse2");
	      return "game5x5";
	   }
	   
	   @RequestMapping(value = "/redirectGame8x8", method = RequestMethod.GET)
	   public String redirect8x8() {
		   return "redirect:game8x8";
	   }
	   
	   @RequestMapping(value = "/game8x8", method = RequestMethod.GET)
	   public String game8x8(Model model) {
		  model.addAttribute("Header","Welcome in GameHorse2");
	      return "game8x8";
	   }
}
