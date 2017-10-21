package PishiINeShurshi;

/*Заданы координаты трех вершин треугольника (x1, y1), (х2, y2), (x3, y3). Найти его периметр и площадь.*/

import java.util.Scanner;

public class Second{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Введите координату х1:");
		
		double x1 = scanner.nextInt();
		
		System.out.println("Введите координату y1:");
		
		double y1 = scanner.nextInt();
		
		System.out.println("Введите координату х2:");
		
		double x2 = scanner.nextInt();
		
		System.out.println("Введите координату y2:");
		
		double y2 = scanner.nextInt();
		
		System.out.println("Введите координату х3:");
		
		double x3 = scanner.nextInt();
		
		System.out.println("Введите координату y3:");
		
		double y3 = scanner.nextInt();
		
		double a = Math.sqrt(Math.pow(x1-x2, 2)*Math.pow(y1-y2, 2));//ищем сторону а
		double b = Math.sqrt(Math.pow(x2-x3, 2)*Math.pow(y2-y2, 2));//ищем сторону b
		double c = Math.sqrt(Math.pow(x3-x1, 2)*Math.pow(y3-y1, 2));//ищем сторону с
		
		double P = a + b + c; // ищем периметр
		double p = (a + b + c)/2; //ищем полупериметр
		double S = Math.sqrt(p*(p-a)*(p-b)*p-c);
		System.out.println(P);
		System.out.println(S);
		
	}
}