package in.webinar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/service2")
public class SecondMicroService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello SecondMicroService!!";
	}
	
	
	@GetMapping("/s1")
	public String consumerService1() {
		String str = "Consumer Service1";
		
		String url = "lb://SERVICE1/service1/";
		str = restTemplate.getForObject(url, String.class);
		
		return str;
	}

}
