package com.tuan.exercise;

import java.util.Scanner;

public class Exercise_13 extends AbstractExercise{
	
	public void checkNumberExtend(Scanner sc) {
		int n = 0;
		System.out.print("Nhap vao so nguyen n = ");
		n = sc.nextInt();
		
		if(isEvenNumber(n) && n != 0) {
			System.out.println("==>" + n + " la so chan");
		}
		else if(n == 0){
			System.out.println("==>" + n + " la zero");
		}
		else
		{
			System.out.println("==>" + n + " la so le");
		}
		System.out.println("<============================>");
	}
}
