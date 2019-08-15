package com.tuan.abs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AbstractExercise {
	
	public boolean isEvenNumber(int n) {
		if (n % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isOddNumber(int n) {
		if (n % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	// caculate
	public int sumNumber(int a, int b) {
		return a + b;
	}

	public int subNumber(int a, int b) {
		return a - b;
	}

	public int divNumber(int a, int b) {
		return a / b;
	}

	public int multipNumber(int a, int b) {
		return a * b;
	}
	
	public int sumEvenNumberFromZero(int n, int i) {
		i = 0;
		int k = 0;
		boolean check = true;
		while(check) {
			i = i + k * 2;
			k++;
			if(k > (n-1)) {
				check = false;
			}
		}
		return i;
	}
	
	//Multiples
	public boolean isMultiplesOfN(int i, int n) {
		if((i % n) == 0) 
			return true;
		else
			return false;
	}
	

	// input
	public int getInputInteger(Scanner sc) {
		boolean check = true;
		int n = 0;
		do {
			try {
				n = sc.nextInt();
				check = false;
			} catch (Exception e) {
				System.out.println("VUI LONG NHAP SO NGUYEN");
				sc.nextLine();
			}

		} while (check);

		return n;
	}

	// triangle
	public boolean isTriangle(int a, int b, int c) {
		if ((a + b > c) && (a + c > b) && (b + c > a) && (a != 0) && (b != 0) && (c != 0))
			return true;
		else
			return false;
	}

	public boolean isRightTriangle(int a, int b, int c) {
		if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b))
			return true;
		else
			return false;
	}
	
	public boolean isIsoscelesTriangle(int a, int b, int c) {
		if(((a == b) && (a != c)) || ((a == c) && (a != b)) || ((b == c) && (a != b)) )
			return true;
		else
			return false;
	}
	
	public boolean isEquilateralTriangle(int a, int b, int c) {
		if((a == b) && (b==c))
			return true;
		else
			return false;
	}

	public void checkTriangle(int a, int b, int c) {
		if(isTriangle(a, b, c)) {
			if(isRightTriangle(a, b, c)) System.out.println("==> LA TAM GIAC VUONG");
			else if(isIsoscelesTriangle(a, b, c)) System.out.println("==> LA TAM GIAC CAN");
			else if(isEquilateralTriangle(a, b, c))	System.out.println("==> LA TAM GIAC DEU");
			else System.out.println("==> LA TAM GIAC THUONG");
		}else {
			System.out.println("==> KHONG PHAI TAM GIAC");
		}
	}
	
	//compare Number
	

}
