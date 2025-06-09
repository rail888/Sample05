package pack;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Sample05Application {
	@GetMapping("/")
	public String hello(){
		// 시간 설정
		String now = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        return "hello 시저 - " + now;
	}

	public static void main(String[] args) {
		SpringApplication.run(Sample05Application.class, args);
	}
}
