package com.personal.control;


import com.personal.entity.User;
import com.personal.service.UserService;
import org.junit.jupiter.api.Test;
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
	

	@Test
	@RequestMapping("/login")
	public String login(HttpSession session, String username, String password, SessionScope sessionScope){
		
		User user=userService.findUserByName(username);
		
		if (user==null) {
			return "login";
		}
		if(!user.getPassword().equals(password))
			return "login";

		session.setAttribute("me", user);
		String s = session.getAttribute("me").toString();
		System.out.printf("*****************"+s);

		return "redirect:toEdit.do";
	}
    @RequestMapping("/logout")
	public String logout(HttpSession session){
        System.out.printf("555555555555555"+session.getAttribute("me").toString());
		session.removeAttribute("me");
        System.out.printf("666666666666666666"+session.getAttribute("me").toString());
		return "login";
	}
	
	

}
