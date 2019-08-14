package com.tuan.exercise;

import java.util.Scanner;

public class Exercise_2 extends AbstractExercise{
	
	public void checkNumber(Scanner sc) {
		int n = 0;
		System.out.print("Nhap vao so nguyen n = ");
		n = sc.nextInt();
		
		if(isEvenNumber(n)) {
			System.out.println("==>" + n + " la so chan");
		}
		else {
			System.out.println("==>" + n + " la so le");
		}
		System.out.println("<============================>");
	}
}
