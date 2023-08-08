
public class BuySellStocks {
	static int sellstock(int prices[]) {
		int i=0;
		int j=0;
		int maxprofit=0;
		while(i<prices.length) {
			maxprofit=Math.max(maxprofit,prices[i]-prices[j]);
			if(prices[i]<prices[j]) 
				j=i;
				i++;
			
					}
		return maxprofit;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prices[]= {7,1,5,3,6,2};
		System.out.println(sellstock(prices));

	}

}
