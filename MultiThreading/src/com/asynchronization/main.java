package com.asynchronization;

public class main {
   public static void main(String[] args) {
		
		AccountDetails accountDetails= new AccountDetails();
		Thread thread1=new Thread(accountDetails);
		Thread thread2= new Thread(accountDetails);
		thread1.setName("Jeevan");
		thread2.setName("soham");
		thread1.start();
		thread2.start();
	}


}
