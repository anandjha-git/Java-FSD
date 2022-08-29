package UserEntity;

public class User {
	 String username;
	 String password;

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}

	// checkCredentials
	public boolean authentication(String username, String password) {

		if ((username == null) || (password == null)) {
			return false;
		}

		if (username.equalsIgnoreCase("Anand123")) {
			if (password.equals("Alfa@12")) {
				return true;
			}
		}

		return false;

	}

}
