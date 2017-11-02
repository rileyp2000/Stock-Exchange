import java.util.HashMap;

/**
 * <p></p> 
 * Nov 2, 2017
 * @author Patrick Riley
 */

/**
 * @author rileyp
 *
 */
public class StockExchange {
	private HashMap<String, Stock> stocks;
	
	public StockExchange() {
		stocks = new HashMap<String, Stock>();
	}
	
	/**
	 * 
	 * Adds a new stock with given parameters to the listed stocks
	 * 
	 * @param symbol stock symbol
	 * @param name full name
	 * @param price opening price
	 *
	 *void
	 */
	public void listStock(String symbol,String name,double price) {
		stocks.put(symbol, new Stock(symbol, name, price));
	}
	
	/**
	 * 
	 * Returns a quote for a given stock.
	 * 
	 * @param symbol stock symbol
	 * @return
	 *
	 *java.lang.String a text message that contains the quote.
	 */
	public java.lang.String getQuote(String symbol){
		return stocks.get(symbol).getQuote();
	}
	
	/**
	 * Places a trade order by calling stock.placeOrder for the stock specified by the stock symbol in the trade order.
	 * @param order a trading order to be placed with this stock exchange.
	 *
	 *void
	 */
	public void placeOrder(TradeOrder order) {
		if(stocks.get(order.getSymbol()) != null)
			stocks.get(order.getSymbol()).placeOrder(order);
			else
				throw new IllegalArgumentException("Stock dont exist boi");
		
	}
}
