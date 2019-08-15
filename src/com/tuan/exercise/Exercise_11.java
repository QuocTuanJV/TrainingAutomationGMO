package com.tuan.exercise;

import java.util.ArrayList;
import java.util.Scanner;

import com.tuan.abs.AbstractExercise;

public class Exercise_11 extends AbstractExercise {

	public void findMaxAndMin(Scanner sc) {
		int n = 0;
		System.out.println("<========== BAI 11 ===========>");
		System.out.print("HAY NHAP SO LUONG CHU SO TRONG DAY n : ");
		n = getInputInteger(sc);
		ArrayList<Integer> a = new ArrayList<>();
		a = getListInput(sc, n);
		System.out.println("==> GIA TRI MAX: " + getNumberMax(a) );
		System.out.println("==> GIA TRI MIN: " + getNumberMin(a) );
		System.out.println("<============================>");
		
	}
}
