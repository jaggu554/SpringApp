package in.jaggu.dao;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;
@Component("dao")
public class UserDao implements InitializingBean {
//	
//	public void init() {
//		System.out.println("getting db connection...");
//	}
////	
//	public void getData() {
//		System.out.println("Getting data from DB...");
//	}
//	public void destroy() {
//		System.out.println("closing db connection...");
//	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("getting db connection...");

		
	}
//
//	@Override
//	public void destroy() throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("closing db connection...");
//	}
}
