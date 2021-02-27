package com.bcore.model;

public interface AccountOperation {
     public double  withdraw(double amount);
     public double  deposit(double amount);
     public double  getInterest();
     public double fundTransfer();
}
