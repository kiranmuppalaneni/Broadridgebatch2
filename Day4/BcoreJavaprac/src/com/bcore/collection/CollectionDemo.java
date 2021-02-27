package com.bcore.collection;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

import com.bcore.model.Account;
import com.bcore.model.Employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionDemo {
	public static void main(String[] args) {

		Collection aList = new HashSet(10);
		
		aList.add(1);
		aList.add("Hello World");
		aList.add(3);
		aList.add(new Account(1001, "acc1", "savings", 10000));
		aList.add(new Employee());
		aList.add(1);
		aList.add("Java");
		aList.add("Hello World");
		aList.add(3);
		aList.add(1);
		aList.add("Hello World");
		aList.add(3);
		aList.add(new Account(1001, "acc1", "savings", 10000));
		aList.add(new Employee());
		aList.add(1);
		aList.add("Java");
		aList.add("Hello World");
		aList.add(3);
		
//		System.out.println(aList);
//		
//	
//		boolean contains = aList.contains("Hello World");
//		System.out.println(contains);
//		
//		aList.remove(3);
//		System.out.println(aList);
//
//		
//		aList.clear();
//		System.out.println(aList);
//		
//		Iterator it = aList.iterator();
//		while (it.hasNext()) {
//				Object obj = it.next();
//				System.out.println(obj);
//		}
		
		//Generic
		TreeSet<String> stringList = new TreeSet<>(); 
		stringList.add("Hello");
		stringList.add("World");
		stringList.add("Java");
		stringList.add("India");
		stringList.add("Broadridge");
		stringList.add("Hello");
		stringList.add("World");
		
//		Iterator<String> it1 = stringList.iterator();
//		while(it1.hasNext()) {
//			String str = it1.next();
//			System.out.println(str);
//		}
		
		for (String str : stringList) {
			System.out.println(str);
		}
		
//		HashMap<Integer,String> hMap = new HashMap<>();
//		
//		hMap.put(1, "One");
//		hMap.put(2, "Two");
//		hMap.put(3, "Three");
//		hMap.put(4, "Two");
//		hMap.put(5, "Five");
//		System.out.println(hMap);
//		System.out.println(hMap.get(4));
//		System.out.println(hMap.keySet());
//		System.out.println(hMap.values());
//		System.out.println(hMap.entrySet());
//		
//		hMap.remove(3);
//		System.out.println(hMap);
//		
//		System.out.println(hMap.containsKey(50));
		
		Account acc1 = new Account(1001, "acc1", "Savings", 10000.00);
		Account acc2 = new Account(1002, "acc2", "Savings", 13000.00);
		Account acc3 = new Account(1003, "acc3", "Savings", 20000.00);
		Account acc4 = new Account(1004, "acc4", "Savings", 30000.00);
		Account acc5 = new Account(1005, "acc5", "Savings", 15000.00);
		
		HashMap<Long,Account> hashMap = new HashMap<>();
		
		hashMap.put(acc1.getAccountNumber(), acc1);
		hashMap.put(acc2.getAccountNumber(), acc2);
		hashMap.put(acc3.getAccountNumber(), acc3);
		hashMap.put(acc4.getAccountNumber(), acc4);
		hashMap.put(acc5.getAccountNumber(), acc5);
		
		Account acc = hashMap.get(1005L);
		System.out.println(acc);
		
		Date date = new Date();
	
	}
}
