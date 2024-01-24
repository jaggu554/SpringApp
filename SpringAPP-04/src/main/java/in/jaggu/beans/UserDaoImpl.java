package in.jaggu.beans;

public class UserDaoImpl implements UserDao{

	@Override
	public String findName(int id) {
		if(id>=0) {
			
			return "Jaggu";
		}
		return "Try Again";
	}

}
