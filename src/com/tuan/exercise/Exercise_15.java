package com.tuan.exercise;

import java.util.ArrayList;
import java.util.Scanner;

import com.tuan.abs.AbstractExercise;



public class Exercise_15 extends AbstractExercise{
	
	public void countNumberCharacters(Scanner sc) {
		int n = 0;
		int k = 0;
		System.out.println("<========== BAI 15 ==========>");
		System.out.print("NHAP VAO SAU KY TU: ");
		String a = sc.nextLine();
		System.out.println("==> SO TU CUA SAU DO LA: " + getNumberArray(a.split("\\s")));
		System.out.println("<============================>");
	}
}
