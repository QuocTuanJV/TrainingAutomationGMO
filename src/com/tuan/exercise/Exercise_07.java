package com.tuan.exercise;

import java.util.Scanner;

import com.tuan.abs.AbstractExercise;

public class Exercise_07 extends AbstractExercise {

	public void printOddNumber() {
		System.out.print("==> So le tu 1 -> 99: ");
		for(int i = 1; i < 100; i++) {
			if(isOddNumber(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println("");
		System.out.println("<============================>");
	}
}
