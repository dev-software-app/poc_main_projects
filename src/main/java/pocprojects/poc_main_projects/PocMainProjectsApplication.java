package pocprojects.poc_main_projects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PocMainProjectsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocMainProjectsApplication.class, args);
	}

}
