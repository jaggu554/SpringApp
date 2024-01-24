package in.jaggu.service;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

@Service("user")
@DependsOn("dao")
public class UserService {

	public UserService() {
		System.out.println("0:Param service constructor...");
	}
}
