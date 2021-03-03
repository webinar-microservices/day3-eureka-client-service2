package in.webinar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service2")
public class SecondMicroService {
	
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello SecondMicroService!!";
	}

}
