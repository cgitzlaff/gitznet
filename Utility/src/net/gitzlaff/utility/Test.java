package net.gitzlaff.utility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd h:mm:ss a zz");
		System.out.println(sdf.format(date));
		
		Random rnd = new Random();
		System.out.println(getInclusiveRandomInt(1, 50, rnd));
	}

	private static int getInclusiveRandomInt(int minVal, int maxVal, Random rnd){
		if ( minVal > maxVal ) {
			throw new IllegalArgumentException("minVal cannot exceed maxVal.");
		}
		
		// Get the range, casting to long to avoid overflow problems
		long range = (long)maxVal - (long)minVal + 1;
		
		// compute a fraction of the range, 0 <= frac < range
		long fraction = (long)(range * rnd.nextDouble());
		
		int randomInt =  (int)(fraction + minVal);
		
		return randomInt;
	}

}
