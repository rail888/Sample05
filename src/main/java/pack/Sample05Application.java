package pack;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Sample05Application {
	@GetMapping("/")
	public String hello(){
		return "hello 시저" + new Date();
	}

	public static void main(String[] args) {
		SpringApplication.run(Sample05Application.class, args);
	}

}
