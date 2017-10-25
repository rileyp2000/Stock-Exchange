/**
 * <p></p> 
 * Oct 25, 2017
 * @author Patrick Riley
 */
import java.text.DecimalFormat;
import java.util.PriorityQueue;
import java.util.Queue;
/**
 * @author rileyp
 *
 */
public class Stock implements Comparable<Stock> {
	private String symbol, name;
	private double lowPrice, highPrice, lastPrice;
	private static DecimalFormat money = new DecimalFormat("$#,##0.00");
	
	private PriorityQueue<TradeOrder> buyOrders;
	private PriorityQueue<TradeOrder> sellOrders;
	
	public Stock(String s, String n, double p) {
		symbol = s;
		name = n; 
		lowPrice = p;
		highPrice = p;
		lastPrice = p;
	}
	
	public String getQuote() {
		return "";
	}
	
	public void placeOrder(TradeOrder order) {
		
	}
	
	public int compareTo(Stock s) {
		return (int)Math.round(lastPrice - s.lastPrice);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Stock symbol:" + symbol + ", name:" + name 
				+ ", initial price:" + money.format(lastPrice);
	}
	
	
}
