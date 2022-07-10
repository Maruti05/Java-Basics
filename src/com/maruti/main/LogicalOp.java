package com.maruti.main;

public class LogicalOp {
	public static void main(String[] args) {
		int a = 45;
		int b = 4;
		System.err.println("=======================AND==============================");
		if (a == 49 && b == 4) {
			System.out.println("satisfied ");
		} else {
			System.out.println("not satis");
		}

		System.err.println("===========================OR===================================");

		if (a == 49 || b == 46) {
			System.out.println("satisfied ");
		} else {
			System.out.println("not satis");
		}

	}
}
