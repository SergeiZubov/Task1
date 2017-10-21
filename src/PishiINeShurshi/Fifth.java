package PishiINeShurshi;

/*Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.*/

import java.util.Scanner;

public class Fifth {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Введите первое число:");
		int a = sn.nextInt();
		System.out.println("Введите второе число:");
		int b = sn.nextInt();
		double ariMean = (Math.pow(a, 3) + Math.pow(b, 3))/2;
		System.out.println("Среднее арифметическое: "+ariMean);
		double geoMean = Math.sqrt(Math.abs(a)*Math.abs(b));
		System.out.println("Среднее геометрическое: "+geoMean);
		
	}

}
