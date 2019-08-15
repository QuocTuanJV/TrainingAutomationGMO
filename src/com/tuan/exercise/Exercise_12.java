package com.tuan.exercise;

import java.util.Scanner;

import com.tuan.abs.AbstractExercise;

public class Exercise_12 extends AbstractExercise{
	
	public void solveTheEquation(Scanner sc) {
		int a, b, c;
		System.out.println("<========== BAI 12 ===========>");
		System.out.println("GIAI PHUONG TRINH ax + b = c");
		System.out.print("Nhap vao so nguyen a = ");
		a = getInputIntegerExtend(sc, "a");
		System.out.print("Nhap vao so nguyen b = ");
		b = getInputInteger(sc);
		System.out.print("Nhap vao so nguyen c = ");
		c = getInputInteger(sc);
		System.out.println("==> phuong trinh can giai: " + a + "x + " + b + " = " + c);
		System.out.println("==> x = " + (c-b)/a);
		System.out.println("<============================>");
		
	}
}
