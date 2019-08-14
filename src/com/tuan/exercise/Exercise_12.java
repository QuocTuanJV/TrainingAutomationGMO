package com.tuan.exercise;

import java.util.Scanner;

public class Exercise_12 extends AbstractExercise{
	
	public void solveTheEquation(Scanner sc) {
		int a, b, c;
		System.out.println("GIAI PHUONG TRINH ax + b = c");
		System.out.print("Nhap vao so nguyen a = ");
		a = sc.nextInt();
		System.out.print("Nhap vao so nguyen b = ");
		b = sc.nextInt();
		System.out.print("Nhap vao so nguyen c = ");
		c = sc.nextInt();
		System.out.println("==> x = " + (c-b)/a);
		System.out.println("<============================>");
		
	}
}
