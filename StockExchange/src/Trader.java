
public class Trader implements Comparable<Trader> {
	private Brokerage brokerage;
	private String username, password;

	public Trader(Brokerage b, String un, String pwd) {
		brokerage = b;
		username = un;
		password = pwd;
	}

	/**
	 * @return the username
	 */
	public String getName() {
		return username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	
	
	public void getQuote(String symbol) {
		brokerage.getQuote(symbol, this);
	}

	@Override
	public int compareTo(Trader other) {
		String n1 = this.getName().toLowerCase();
		String n2 = other.getName().toLowerCase();
		return n1.compareTo(n2);
	}

	@Override
	public boolean equals(Object other) {
		if (other instanceof Trader)
			return compareTo(((Trader) other)) == 0;
		else
			return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Trader Brokerage: " + brokerage + ", Username: " + username;
	}

}
