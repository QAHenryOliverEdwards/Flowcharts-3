package com.qa.main;

public class Loop2 {
	public void myLoop() {
		for (int A = 100; A <= 200; A++) {
			if (A%2 == 0) {
				System.out.println("-");
			}
			else {
				System.out.println("*");
			}
		}
	}
}
