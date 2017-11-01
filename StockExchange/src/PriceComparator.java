/**
 * <p></p> 
 * Nov 1, 2017
 * @author Patrick Riley
 */

/**
 * @author rileyp
 *
 */
public class PriceComparator implements Comparator<TradeOrder> {
 boolean ascend;
 
 public PriceComparator() {
	 ascend = true;
 }
 
 public PriceComparator(boolean a) {
	 ascend = a;
 }
 
 public int compare(TradeOrder t1, TradeOrder t2) {
	 if(t1.isMarket() && t2.isMarket())
		 return 0;
	 if(t1.isMarket() && t2.isLimit())
		 return -1;
	 if(t1.isLimit() && t2.isMarket())
		 return 1;
	 if(ascending)
	 
 }	
}
