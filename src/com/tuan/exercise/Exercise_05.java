package com.tuan.exercise;

import java.util.Scanner;

import com.tuan.abs.AbstractExercise;

public class Exercise_05 extends AbstractExercise {

	public void checkNumberAndValue(Scanner sc) {
		int n = 0;
		System.out.println("<========== BAI 5 =============>");
		System.out.print("Nhap vao so nguyen n = ");
		n = getInputInteger(sc);
		if (n > 5) {
			System.out.println("==> n = " + n + " => n > 5");
			n = n + 2;
			System.out.println("Gia tri n tang len 2 la: n + 2 = " + n);
		} else if (n == 5) {
			System.out.println("==> n = " + n);
			n = 0;
			System.out.println("Gia tri cua n = " + n);
		} else {
			System.out.println("==> n = " + n + " => n < 5");
			n = 0;
			System.out.println("Gia tri cua n = " + n);
		}
		System.out.println("<============================>");
	}
}
