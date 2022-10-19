package test.data;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // RestController와 다른 기능
public class HelloController {
	
	@GetMapping("/") // 공통매핑
	public String home()
	{
		return "hello";
	}

}
