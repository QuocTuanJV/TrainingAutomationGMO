package com.tuan.exercise;

import java.util.Scanner;

import com.tuan.abs.AbstractExercise;

public class Exercise_08 extends AbstractExercise {

	public void printSumNumberOfMultiplesN(Scanner sc) {
		int sum = 0;
		int n = 0;
		System.out.print("HAY NHAP BOI SO MA BAN MUON TINH TONG: n = ");
		n = getInputInteger(sc);
		for(int i = 1; i < 100; i++) {
			if(isMultiplesOfN(i, n)) {
				sum = sum + i;
			}
		}
		System.out.print("==> Tong cac boi so cua " + n + " tu 1 -> 100: " + sum);
		System.out.println("");
		System.out.println("<============================>");
	}
	
	
}
