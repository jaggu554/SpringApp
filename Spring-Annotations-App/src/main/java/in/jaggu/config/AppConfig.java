package in.jaggu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages  = "in.jaggu")
public class AppConfig {

	public AppConfig() {
		System.out.println("APPConfig::Constructor");
	}
	
	@Bean
	public Engine engine() {
		Engine eng=new Engine();
		return eng;
	}
	
}
