package com.tuan.main;

import java.util.Scanner;

import com.tuan.exercise.Exercise_12;
import com.tuan.exercise.Exercise_13;
import com.tuan.exercise.Exercise_2;

public class MainExercise {

	public static void main(String[] args) {

		int n = 1;
		int k = 2;
		String i;
		int ex = 0;
		Scanner sc = new Scanner(System.in);
		Exercise_2 ex2 = new Exercise_2();
		Exercise_12 ex12 = new Exercise_12();
		Exercise_13 ex13 = new Exercise_13();

		do {
			System.out.print("NHAP SO BAI TAP: ");
			ex = sc.nextInt();
			switch (ex) {
			case 2: {
				ex2.checkNumber(sc);
				break;
			}
			case 12: {
				ex12.solveTheEquation(sc);
				break;
			}
			case 13: {
				ex13.checkNumberExtend(sc);
			}
			}
			System.out.println("NHAP 1 DE TIEP TUC HOAC NHAP 0 DE KET THUC");
			n = sc.nextInt();
			if (n != 1 && n != 0) {	
				do { 	
					System.out.println("VUI LONG NHAP 1 HOAC O DE TIEP TUC");
					k = sc.nextInt();
				}while(k != 1 && k != 0);
				n = 1;
				continue;
			} else if (n == 0) {
				System.out.println("BAN CO CHAC MUON THOAT : Y / N");
				i = sc.next();
				if (i.equals("y") || i.equals("Y") ) {
					break;
				} else {
					n = 1;
					continue;
				}
			}

		} while (n == 1);
		
		System.out.println("HEN GAP LAI :D !!!!!");

	}

}
