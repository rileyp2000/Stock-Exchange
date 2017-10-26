
public class Trader {
	private Brokerage brokerage;
	private String username, password;
	
	public Trader(Brokerage b, String un, String pwd) {
		brokerage = b; 
		username = un;
		password = pwd;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Trader Brokerage: " + brokerage + ", Username: " + username;
	}
	
	
}
