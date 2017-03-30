package com.personal.control;


import com.personal.entity.User;
import com.personal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/")
public class UserController {
	
	@Autowired
	 private UserService userService;
	
	
	@RequestMapping("/login")
	public String login(HttpSession session, String username, String password){
		
		User user=userService.findUserByName(username);
		
		System.out.println(user);
		if (user==null) {
			return "login";
		}
		if(!user.getPassword().equals(password))
			return "login";
		
		session.setAttribute("me", user);
		return "redirect:toEdit.do";
	}
	
	

}
