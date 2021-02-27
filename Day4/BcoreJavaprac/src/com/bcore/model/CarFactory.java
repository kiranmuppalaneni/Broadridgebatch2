package com.bcore.model;

public class CarFactory {
	public static void main(String[] args) {
            Car car1 =   new Car();
            car1.model = "model1";
            car1.price = 500000.00;
            System.out.println(car1.model);
            System.out.println(car1.price);
            
            Car car2  = new Car();
            car2.model = "model2";
            car2.price = 2000000;
            
            System.out.println(car2.model);
            System.out.println(car2.price);
	}
}
