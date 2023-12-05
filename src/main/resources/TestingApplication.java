 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@SpringBootApplication
public class TestingApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(TestingApplication.class, args);
	}	
		@Bean
		public  RestTemplate resttemplate(){
		return new RestTemplate();
		}
}


