package com.tuan.exercise;

import java.util.Scanner;

import com.tuan.abs.AbstractExercise;

public class Exercise_10 extends AbstractExercise {

	public void sumEvenNumberOrOddNumber(Scanner sc) {
		int sum = 0;
		int n = 0;
		System.out.print("HAY NHAP n DE THUC HIEN TINH TONG n = ");
		n = getInputInteger(sc);
		if (isEvenNumber(n)) {
			for (int i = 0; i <= n; i = i + 2) {
				sum = sum + i;
			}
			if (n > 4) {
				System.out.print("==> Tong cac so 2 + 4 + ... + " + n + " : " + sum);
			} else if (n == 4) {
				System.out.print("==> Tong cac so 2 + 4 : " + sum);
			} else {
				System.out.print("==> Tong cac so 2 : " + sum);
			}
		} else if (isOddNumber(n)) {
			for (int i = 1; i <= n; i = i + 2) {
				sum = sum + i;
			}
			System.out.print("==> Tong cac so 1 + 3 + ... + " + n + " : " + sum);
		}

		System.out.println("");
		System.out.println("<============================>");
	}
}