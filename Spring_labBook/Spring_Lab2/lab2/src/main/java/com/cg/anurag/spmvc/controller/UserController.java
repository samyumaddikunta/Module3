package com.cg.anurag.spmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	
	
	@PostMapping("/validateUser")
	public String validateUserLogin(@RequestParam("uid")String username,
			                                                @RequestParam("pass")String password,Model model)
	{
		   String message="Invalid Username/Password";
		   if(username.equalsIgnoreCase("manish") && password.equals("manish")) 
		   return "trainee";
		   else return null;
	}
	 //model.addAttribute("message",message);
}    //  message="You are an Authorised User...Welcome";
