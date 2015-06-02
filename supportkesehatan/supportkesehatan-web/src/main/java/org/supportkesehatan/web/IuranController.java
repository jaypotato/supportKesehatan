package org.supportkesehatan.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IuranController {
	@RequestMapping(value = "/pembayaraniuran", method = RequestMethod.GET)
	public String riwayatiuran() {
		return "bayariuran"; // login.jsp
	}
}
