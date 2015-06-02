package org.supportkesehatan.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	// Add check login function
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login"; // login.jsp
	}
	
//	@RequestMapping(value="/login/do", method = RequestMethod.POST)
//	public String login(@RequestParam("username") String username, 
//			@RequestParam("password") String password, ModelMap model) {
//		
////		HibUsersDao userDao = new HibUsersDao();
////		Users user = userDao.findByIdAndPassword(username, password);
//		Login test = new Login();
//		boolean check = test.checkUser(username, password);
//		
//		if(check == true){
//			return "sukses";
//		}
//		
//		else {
//			return "gagal";
//		}
//		
//		// query
//		// if success
//		//    buka halaman sukses.jsp
//		// else
//		//    buka halaman gagal.jsp
//	}
	
}
