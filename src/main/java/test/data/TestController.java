package test.data;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController // RestController 는 JSON 으로 데이터 반환 밖에 안된다. 브라우져로 출력 안된다.
public class TestController {
	
	@GetMapping("/test")
	public TestDto hello()
	{
		TestDto dto=new TestDto(); 
		dto.setName("김이름");
		dto.setAddr("코리아");
		return dto;
	}

}
