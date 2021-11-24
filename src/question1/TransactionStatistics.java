/*
 * Copyright (c) 2006-2019 Henri Tremblay.
 */
package question1;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Please implement the {@link #mostPopularTicker(List)} method. With a sequential and a parallel algorithm.
 * DO NOT modify the existing code.
 */
public final class TransactionStatistics {

   /**
    * Return the most popular ticker in terms of transaction total absolute value (i.e. abs(price * quantity)). For example,
    * let's say we have these transactions:
    * <ul>
    *     <li>transaction("a", -10, 2.0)</li> -20
    *     <li>transaction("a", 20, 1.0)</li> 20
    *     <li>transaction("b", 5, 1.0)</li> 5
    *     <li>transaction("b", 10, 1.0)</li> 10
    *     <li>transaction("b", 10, 1.0)</li> 10
    * </ul>
    * The most popular one ticker is "a" with a traded value of 40 compared to b that only has 25.
    *
    * @param list List containing all transactions we want to look at
    * @return the most popular ticker
    */
   public static String mostPopularTicker(List<Transaction> transactions) {
	   
	   Map<String, Integer> popular = new HashMap<>();
	   
	   int total = 0;
	   int updated = 0;
	   
	   for (Transaction t : transactions) {
		
		   total = (int) Math.abs(t.getPrice() * t.getQuantity());
		   
		   if (popular.containsKey(t.getTicker())) {
			   updated = popular.get(t.getTicker());
			   popular.put(t.getTicker(), updated + total);   
		   
		   }else {
			   
			   popular.put(t.getTicker(), total);
			   
		   }
		   
		   //System.out.println(" Ticker " + popular.toString() + " traded " + popular.get(t.getTicker()));
		
		   total = 0;
      }
	   
	   Object maxEntry = Collections.max(popular.entrySet(), Map.Entry.comparingByValue()).getKey();
	   
	   return "The most popular ticker is: " + maxEntry;
   }

   private TransactionStatistics()  {}
}
