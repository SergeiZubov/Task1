package PishiINeShurshi;

import java.util.Scanner;

/*Вычислить расстояние между двумя точками с данными координатами (x1, y1) и (x2, y2).*/

public class Sixth {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Введите координату x1:");
		int x1 = sn.nextInt();
		System.out.println("Введите координату y1:");
		int y1 = sn.nextInt();
		System.out.println("Введите координату x2:");
		int x2 = sn.nextInt();
		System.out.println("Введите координату y2:");
		int y2 = sn.nextInt();
		int a = Math.abs(x1-x2);
		int b = Math.abs(y1-y2);
		double c = Math.sqrt((a*a)+(b*b));
		System.out.println(c);		
	}

}
