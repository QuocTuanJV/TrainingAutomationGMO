package com.tuan.exercise;

import java.util.Scanner;

import com.tuan.abs.AbstractExercise;

public class Exercise_09 extends AbstractExercise {

	public void sumNumberToN(Scanner sc) {
		int sum = 0;
		int n = 0;
		System.out.print("HAY NHAP n DE THUC HIEN TINH TONG 1 + 2 + 3 +...+ n: n = ");
		n = getInputInteger(sc);
		for(int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.print("==> Tong cac so tu 1 -> " + n + " : " + sum);
		System.out.println("");
		System.out.println("<============================>");
	}
}
