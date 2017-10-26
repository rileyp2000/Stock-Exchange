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
}
