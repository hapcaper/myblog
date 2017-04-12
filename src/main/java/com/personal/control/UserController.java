package com.personal.control;


import com.personal.entity.User;
import com.personal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.SessionScope;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/")
public class UserController {
	
	@Autowired
	 private UserService userService;
	

	@RequestMapping("/login.do")
	public String login(HttpSession session, String username, String password, SessionScope sessionScope){
		
		User user=userService.findUserByName(username);
		
		if (user==null) {
			return "login";
		}
		if(!user.getPassword().equals(password))
			return "login";

		session.setAttribute("me", user);

		return "redirect:blog/toEdit.do";
	}
    @RequestMapping("logout.do")
	public String logout(HttpSession session){
		session.removeAttribute("me");
		return "login";
	}
	
	

}
