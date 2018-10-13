package webbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import webbank.model.RegistrationPreload;
import webbank.service.RegisterService;
/**
 * main controller of the application
 * 
 * @author Gabor
 *
 */
@Controller
public class WebBankController {

	@Autowired
	private RegisterService registerService;

	@RequestMapping("/")
	public String getIndex() {
		return "static/index.html";
	}

	@RequestMapping("/registration/preload")
	@ResponseBody
	public RegistrationPreload registrationPreload() {
		return registerService.getRegister();
	}

}
