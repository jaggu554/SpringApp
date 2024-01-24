package in.jaggu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.jaggu.AppConfig;
import in.jaggu.dao.UserDao;

public class AppTest {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		UserDao dao=context.getBean(UserDao.class);
		//dao.getData();
		ConfigurableApplicationContext ctxx=(ConfigurableApplicationContext)context;
		ctxx.close();
	}
}
