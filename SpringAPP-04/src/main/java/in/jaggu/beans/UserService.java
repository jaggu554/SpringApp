package in.jaggu.beans;

public class UserService {

	private UserDao dao;
	
	public UserService() {
		System.out.println("0:paramConstructor");
	}
	
	public UserService(UserDao dao) {
		this.dao=dao;
	}

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}
	
	public void printName(int id) {
		String status=dao.findName(id);
		
		System.out.println(status);	
		}
	}

