package com.bcore.model;
import java.util.Date;

public class TravelPlanner {

	public static void main(String[] args) {
		Travel travel1 = new Travel();
		travel1.initateTravel(2, "bus", 10, 250);		 
	    double totalAmount =  travel1.calculateBudget();
	    System.out.println(totalAmount);
	    
		Travel travel2 = new Travel();
		travel2.initateTravel(5, "flight", 6, 500);		 
	    double totalAmount1 =  travel2.calculateBudget();
	    System.out.println(totalAmount1);
	}
}
