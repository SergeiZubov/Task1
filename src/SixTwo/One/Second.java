package SixTwo.One;

import java.util.Scanner;

/*Даны две точки А(х1, у1) и В(х2, у2). 
 *Составить алгоритм, определяющий, которая из точек находится ближе к началу координат.*/

public class Second {
	static Scanner sc = new Scanner(System.in);

	public static void Print() { 
		System.out.println("введите целое число: ");
	}

	public static int Test() {
		while (!sc.hasNextInt()) {
			sc.next();
			Print();
		}
		return 0;
	}

	public static double distanceBetweenZeroAndPoint(int a, int b) {
		double c = (double) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		return c;
	}

	public static void printResult(double a, double b) {
		System.out.println("Расстояние до точки А = " + a);
		System.out.println("Рвсстояние до точки Б = " + b);
		if (a < b) {
			System.out.println("Точка А находится ближе к началу координат");
		} else
			System.out.println("Точка Б находится ближе к началу координат");
	}

	public static void main(String[] args) {

		Print();
		int x1 = Test();
		x1 = sc.nextInt();

		Print();
		int y1 = Test();
		y1 = sc.nextInt();

		Print();
		int x2 = Test();
		x2 = sc.nextInt();

		Print();
		int y2 = Test();
		y2 = sc.nextInt();

		double distance1 = distanceBetweenZeroAndPoint(x1, y1);
		double distance2 = distanceBetweenZeroAndPoint(x2, y2);

		printResult(distance1, distance2);
	}

}
