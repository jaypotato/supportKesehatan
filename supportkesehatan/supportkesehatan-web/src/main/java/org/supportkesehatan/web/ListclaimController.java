package org.supportkesehatan.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ListclaimController {
	@RequestMapping(value = "/listklaim", method = RequestMethod.GET)
	public String listclaim() {
		return "admin-klaim"; // login.jsp
	}
}
