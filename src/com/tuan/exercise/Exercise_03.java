package com.tuan.exercise;

import java.util.Scanner;

import com.tuan.abs.AbstractExercise;

public class Exercise_03 extends AbstractExercise{
	
	public void checkTriangle(Scanner sc) {
		int a = 0;
		int b = 0;
		int c = 0;	
		System.out.println("<========== BAI 3 =============>");
		System.out.print("Nhap vao canh thu nhat a = ");
		a = getInputInteger(sc);
		System.out.print("Nhap vao canh thu hai  b = ");
		b = getInputInteger(sc);
		System.out.print("Nhap vao canh thu ba   c = ");
		c = getInputInteger(sc);
		checkTriangle(a, b, c);	
		System.out.println("<============================>");
	}
}
