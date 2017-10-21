package SixTwo.One;

import java.util.Scanner;

/*Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны,
 *и в четвертую степень — отрицательные.*/

public class First {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		a = Exponentiation(a);
		b = Exponentiation(b);
		c = Exponentiation(c);
		System.out.println(a+" "+ b+" "+c);
	}
	public static double Exponentiation(double a) {
		if (a >= 0) {
			return Math.pow(a, 2);
		}else return Math.pow(a, 4);
	}

}
