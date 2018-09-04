package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@Value("${introduccion.spring.nombre}")
	private String nombre;

	@RequestMapping("/")
	public String index() {
		return  nombre; //"Greetings from Spring Boot!";
	}

}