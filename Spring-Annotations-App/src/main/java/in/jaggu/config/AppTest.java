package in.jaggu.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {

	public static void main(String[] args) {
		ApplicationContext context=
				new AnnotationConfigApplicationContext(AppConfig.class);
	}
}
