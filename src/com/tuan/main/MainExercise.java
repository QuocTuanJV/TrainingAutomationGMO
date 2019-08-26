package com.tuan.main;

import java.util.Scanner;

import com.tuan.exercise.Exercise_12;
import com.tuan.exercise.Exercise_13;
import com.tuan.exercise.Exercise_14;
import com.tuan.exercise.Exercise_15;
import com.tuan.abs.AbstractMain;
import com.tuan.exercise.ExSelenium;
import com.tuan.exercise.Exercise_02;
import com.tuan.exercise.Exercise_03;
import com.tuan.exercise.Exercise_04;
import com.tuan.exercise.Exercise_05;
import com.tuan.exercise.Exercise_06;
import com.tuan.exercise.Exercise_07;
import com.tuan.exercise.Exercise_08;
import com.tuan.exercise.Exercise_09;
import com.tuan.exercise.Exercise_10;
import com.tuan.exercise.Exercise_11;

public class MainExercise extends AbstractMain {

	public MainExercise(Scanner sc) {
		super(sc);

	}

	public static void main(String[] args) {
		MainExercise me = new MainExercise(sc);
		int n = 1;
		int k = 0;
		String i;
		int ex = 0;

		ExSelenium ex1 = new ExSelenium();
		Exercise_02 ex2 = new Exercise_02();
		Exercise_03 ex3 = new Exercise_03();
		Exercise_04 ex4 = new Exercise_04();
		Exercise_05 ex5 = new Exercise_05();
		Exercise_06 ex6 = new Exercise_06();
		Exercise_07 ex7 = new Exercise_07();
		Exercise_08 ex8 = new Exercise_08();
		Exercise_09 ex9 = new Exercise_09();
		Exercise_10 ex10 = new Exercise_10();
		Exercise_11 ex11 = new Exercise_11();
		Exercise_12 ex12 = new Exercise_12();
		Exercise_13 ex13 = new Exercise_13();
		Exercise_14 ex14 = new Exercise_14();
		Exercise_15 ex15 = new Exercise_15();

		do {
			System.out.print("NHAP SO BAI TAP: ");
			ex = me.getInputIntegerExceptionExcercise(sc);
			sc.nextLine();
			switch (ex) {
			case 1: {
				ex1.caculateNumber(sc);
				break;
			}
			case 2: {
				ex2.checkNumber(sc);
				break;
			}
			case 3: {
				ex3.checkTriangle(sc);
				break;
			}
			case 4: {
				ex4.checkNumberAndPrint(sc);
				break;
			}
			case 5: {
				ex5.checkNumberAndValue(sc);
				break;
			}
			case 6: {
				ex6.sumFirstTenEvenNumber(sc);
				break;
			}
			case 7: {
				ex7.printOddNumber();
				break;
			}

			case 8: {
				ex8.printSumNumberOfMultiplesN(sc);
				break;
			}
			case 9: {
				ex9.sumNumberToN(sc);
				break;
			}
			case 10: {
				ex10.sumEvenNumberOrOddNumber(sc);
				break;
			}
			case 11: {
				ex11.findMaxAndMin(sc);
				break;
			}
			case 12: {
				ex12.solveTheEquation(sc);
				break;
			}
			case 13: {
				ex13.checkNumberExtend(sc);
				break;
			}
			case 14: {
				ex14.printMultiplesOfN(sc);
				break;
			}
			case 15: {
				ex15.countNumberCharacters(sc);
				break;
			}
			}
			System.out.println("NHAP 1 DE TIEP TUC HOAC NHAP 0 DE KET THUC : 1 / 0");
			n = me.getInputIntegerExceptionContinue(sc);
//			if (n != 1 && n != 0) {
//				do {
//					System.out.println("VUI LONG NHAP 1 HOAC O DE TIEP TUC");
//					k = sc.nextInt();
//				} while (k != 1 && k != 0);
//				n = 1;
//				continue;
//			} else 
				if (n == 0) {
				System.out.println("BAN CO CHAC MUON THOAT : Y / N");
				i = me.getInputChar(sc);
				if (i.equals("y") || i.equals("Y")) {
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
