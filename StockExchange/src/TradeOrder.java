/**
 * <p></p> 
 * Oct 25, 2017
 * @author Patrick Riley
 */

public class TradeOrder {
	
	private Trader trader;
	private int numShares;
	private double price;
	private String symbol;
	private boolean buy, market;
	
	TradeOrder(Trader trade, String s, boolean buyOrder, boolean marketOrder, int shares, double p){
		trader = trade;
		symbol = s;
		price = p;
		buy = buyOrder;
		market = marketOrder;
		numShares = shares;		
	}

	/**
	 * @return the trader
	 */
	public Trader getTrader() {
		return trader;
	}

	/**
	 * @param trader the trader to set
	 */
	public void setTrader(Trader trader) {
		this.trader = trader;
	}

	/**
	 * @return the numShares
	 */
	public int getNumShares() {
		return numShares;
	}

	/**
	 * @param numShares the numShares to set
	 */
	public void setNumShares(int numShares) {
		this.numShares = numShares;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the symbol
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * @param symbol the symbol to set
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	/**
	 * @return the buy
	 */
	public boolean isBuy() {
		return buy;
	}

	/**
	 * @param buy the buy to set
	 */
	public void setBuy(boolean buy) {
		this.buy = buy;
	}

	/**
	 * @return the market
	 */
	public boolean isMarket() {
		return market;
	}

	/**
	 * @param market the market to set
	 */
	public void setMarket(boolean market) {
		this.market = market;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TradeOrder Trader= " + trader + ", numShares= " + numShares + ", price= " + price + ", symbol= " + symbol
				+ ", Buy = true, Sell = false: Order is " + buy + ", Market = true, Limit = false: Order is " + market;
	}
	
	
}
