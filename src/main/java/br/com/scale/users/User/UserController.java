package br.com.scale.users.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {	
	
	@Autowired
	private UserService userService;
	
	@GetMapping("{page}")
	public List<User> users(@PathVariable long page) {
		return userService.user(page);
	}
}
