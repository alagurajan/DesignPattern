package com.source.observer;

public class GrabStocks {
	
	public static void main(String[] args) {
		
		StockGrabber stockGrabber	=	new StockGrabber();
		
//		StockObserver observer1		=	new StockObserver(stockGrabber);
		
//		stockGrabber.setIBMPrice(197.00);
//		stockGrabber.setApplePrice(677.00);
//		stockGrabber.setGooglePrice(676.00);
		
		StockObserver observer2		=	new StockObserver(stockGrabber);
		
//		stockGrabber.setIBMPrice(197.00);
//		stockGrabber.setApplePrice(677.00);
//		stockGrabber.setGooglePrice(676.00);
//		
//		stockGrabber.unregister(observer1);
//		stockGrabber.setIBMPrice(197.00);
//		stockGrabber.setApplePrice(677.00);
//		stockGrabber.setGooglePrice(676.00);
		
		Runnable getIBM		=	new GetTheStock(stockGrabber, 2, "IBM", 197.00);
		Runnable getAPPL	=	new GetTheStock(stockGrabber, 2, "APPL", 670.60);
		Runnable getGOOG	=	new GetTheStock(stockGrabber, 2, "GOOG", 667.40);
		
		new Thread(getIBM).start();
		new Thread(getAPPL).start();
		new Thread(getGOOG).start();
	}

}
