public class Application {

	public static void main(String[] args) {
		
		// AddUser
		User u = new User("Gosia", "Kowalska", 788848832);
		UserDao uDao = new UserDao(); 
		uDao.addUser(u);
	}
}
