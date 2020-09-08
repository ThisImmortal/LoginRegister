package com.userloginregister.usercontroller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import javax.xml.ws.http.HTTPBinding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import com.userloginregister.entity.Login;
import com.userloginregister.entity.User;
import com.userloginregister.service.userService;

@Controller
@SessionAttributes("user")
@RequestMapping("/user")

public class UserController {

	@Autowired
	private userService userService;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {

		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@GetMapping("/toMainPage")
	public String toMainPage() {

		return "mainpage";
	}

	@GetMapping("/toWelcomePage")
	public String toWelcomePage(@RequestParam("userId") int theId, ModelMap mm) {

		User user = userService.getUserById(theId);
		mm.addAttribute("user", user);

		return "welcome-page";
	}

	@GetMapping("/toCVTemplate")
	public String toCVTemplate() {

		return "cv-templates/cv-template1";
	}

	@GetMapping("/showLoginForm")
	public String showLoginForm(Model theModel) {

		Login login = new Login();
		theModel.addAttribute("login", login);

		return "login-form";
	}

	@GetMapping("/showRegisterForm")
	public String showRegisterForm(Model theModel) {

		User theUser = new User();
		theModel.addAttribute("user", theUser);

		return "register-form";
	}

	@PostMapping("/registerProcess")
	public String registerUser(@Valid @ModelAttribute("user") User theUser, BindingResult theBindingResult,
			@ModelAttribute("login") Login theLogin) {

		if (theBindingResult.hasErrors()) {
			return "register-form";
		}
		
//		if(!theUser.getPassword().equals(theUser.getRePassword())) {
//			
//			mm.addAttribute("passwordMatching", "Passwords don't match");
//			return "register-form";
//		}

		userService.registerUser(theUser);
		return "login-form";

	}

	@GetMapping("/loginProcess")
	public String loginProcess(@Valid @ModelAttribute("login") Login login, BindingResult theBindingResult,
			ModelMap mm) {

		if (theBindingResult.hasErrors()) {
			return "login-form";
		}
		User user = userService.userIsValid(login);
		

		if (user!=null) {

			mm.addAttribute("user", user);
			
			return "welcome-page";

		}

		mm.addAttribute("invaliduser", "invalid user credentials");
		return "login-form";

	}

	@GetMapping("/showUpdateInfo")
	public String showUpdateUserInfo(@RequestParam("userId") int theId, Model theModel) {

		User theUser = userService.getUserById(theId);
		theModel.addAttribute("user", theUser);
		
		return "update-form";
	}

	@PostMapping("/updateProcess")
	public String updateUserInfo(@Valid @ModelAttribute("user") User theUser, BindingResult resultBinding,
			ModelMap mm) {

		if (resultBinding.hasErrors()) {

			mm.addAttribute("user", theUser);
			return "update-form";
		}

		userService.updateUserInfo(theUser);

		return "welcome-page";
	}

}
