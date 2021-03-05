package in.webinar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/service2")
public class SecondMicroService {
	
	// Consuming the object
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello SecondMicroService!!";
	}
	
	
	@GetMapping("/v1")
	public String iAmDependentOnService1() {
		
		// OLD APPROACH
		String url = "http://localhost:8081/service1/";
		String response = restTemplate.getForObject(url, String.class);
		
		return response;
	}
	
	
	/**
	 * http://localhost:8080/service2/v2/
	 * @return
	 */
	@GetMapping("/v2")
	public String iAmDependentOnService2() {
		
		// OLD APPROACH
		String url = "http://SERVICE1/service1/";
		String response = restTemplate.getForObject(url, String.class);
		
		return response;
	}
	
	
	@GetMapping("/v3")
	public String iAmDependentOnService3() {
		
		// OLD APPROACH
		String url = "lb://SERVICE1/service1/";
		String response = restTemplate.getForObject(url, String.class);
		
		return response;
	}

}
