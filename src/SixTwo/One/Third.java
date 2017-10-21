package SixTwo.One;

import java.util.Scanner;

/*Даны два угла треугольника (в градусах).
 *Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.*/

public class Third {
	static Scanner sc = new Scanner(System.in);
	
	public static void Print() {
		System.out.println("Введите целое число ");
	}
	
	public static int Test() {
		while(!sc.hasNextInt()) {
			sc.next();
			Print();
		}
		return 0;
	}
	
	public static void Test2(int a,int b) {
		if ((0<=a&&a<=180)&&(0<=b&&b<=180)) {
			if ((a+b)==90) {
				System.out.println("Треугольник прямоугольный");
				return;
			}if ((a+b)<180) {
				System.out.println("Треугольник существует");
			}else System.out.println("Сумма 3-х углов трекгольника должна быть 180 градусов, а тут и 2 справились");
		}else System.out.println("Такого треугольника не существует");
	}
	
	public static void main(String[] args) {
		Print();
		int a = Test();
		a = sc.nextInt();
		
		Print();
		int b = Test();
		b = sc.nextInt();
		
		Test2(a,b);
		
	}
}
