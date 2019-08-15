package com.tuan.exercise;

import java.util.Scanner;

import com.tuan.abs.AbstractExercise;

public class Exercise_04 extends AbstractExercise {

	public void checkNumberAndPrint(Scanner sc) {
		int n = 0;
		System.out.print("Nhap vao so nguyen n = ");
		n = getInputInteger(sc);
		if (isEvenNumber(n)) {
			System.out.println("==> n = " + n + " la so chan");
			System.out.println("Gia tri 2 x n = " + 2 * n);
		} else {
			System.out.println("So nguyen vua nhap la n = " + n);
		}
		System.out.println("<============================>");
	}
}
