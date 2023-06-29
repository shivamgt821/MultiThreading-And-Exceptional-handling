package com.jsp.Multithreading;

public class Demo3Th {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setName("BALAYA");

	}

}
