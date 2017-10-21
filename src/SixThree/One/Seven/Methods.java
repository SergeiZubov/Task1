package SixThree.One.Seven;

import java.util.Scanner;

public class Methods {
	String S = "Площадь круга = ";
	String rad = "Радиус";
	String D = "Диаметр";
	String L = "Длинна окружности";
	String dataSelection = "Введите значение соответствующее исходным данным:" + "\n1 - " + rad + "\n2 - " + D
			+ "\n3 - " + L;
	String addData = "Введите значение";
	Scanner sc = new Scanner(System.in);

	void Print(String s) {
		System.out.println(s);
	}

	void Test(String s) {
		while (!sc.hasNextInt()) {
			sc.next();
			Print(s);
		}
	}

	int Value() {
		int a = sc.nextInt();
		return a;
	}

	int trueValue() {
		int a;
		for (;;) {
			a = Value();
			if (0 < a && a <= 3) {
				Print(addData);
				return a;
			} else {
				Print(dataSelection);
				Test(dataSelection);
			}
		}
	}

	double formulaRadius(double a) {
		double b = Math.PI * Math.pow(a, 2);
		return b;
	}

	double formulaDiametr(double a) {
		double b = Math.PI * Math.pow(a, 2) / 4;
		return b;
	}

	double formulaLine(double a) {
		double b = Math.pow(a, 2) / (4 * Math.PI);
		return b;
	}

	/*
	 * void Mutka(double a1) { int a = trueValue(); if (a == 1) { double b =
	 * formulaRadius(a1); Print(S + b); } else { if (a == 2) { double b =
	 * formulaDiametr(a1); Print(S+b); }else { double b = formulaLine(a1);
	 * Print(S+b); } }
	 */
}
