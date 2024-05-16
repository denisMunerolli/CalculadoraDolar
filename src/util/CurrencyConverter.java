package util;

import java.time.temporal.TemporalAmount;

public class CurrencyConverter {
	
	public static double IOF = 0.06; 
	
	public static double dollarToReal(double amont, double dollarPrice) {
		return amont * dollarPrice * (1.0 + IOF);
	}

}
