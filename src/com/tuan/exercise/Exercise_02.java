package com.tuan.exercise;

import java.util.Scanner;

import com.tuan.abs.AbstractExercise;

public class Exercise_02 extends AbstractExercise{
	
	public void checkNumber(Scanner sc) {
		int n = 0;
		System.out.println("<========== BAI 2 =============>");
		System.out.print("Nhap vao so nguyen n = ");
		n = getInputInteger(sc);
		
		if(isEvenNumber(n)) {
			System.out.println("==> " + n + " la so chan");
		}
		else {
			System.out.println("==> " + n + " la so le");
		}
		System.out.println("<============================>");
	}
}
