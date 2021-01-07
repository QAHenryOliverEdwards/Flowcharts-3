package com.qa.main;

public class OnetoTen2 {
	public void Loop1to10() {
		for (int i = 1; i <= 10; i ++) {
			for (int j = 1; j <= i; j++) {
				System.out.println(i);
			}
		}
	}
}
