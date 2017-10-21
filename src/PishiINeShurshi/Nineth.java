package PishiINeShurshi;

import java.util.Scanner;

/* Дана сторона равностороннего треугольника.
 * Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей.*/

public class Nineth {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Введите сторону треугольника(целое число): ");
		while(!sn.hasNextInt()) {
			sn.next();
			System.out.println("Введите это ёбаное целое число: ");
		}
		int a = sn.nextInt();
		double h = Math.sqrt(Math.pow(a, 2)*Math.pow(a/2, 2));
		double S = a*h/2;
		double r = Math.sqrt(3)/6*a;
		double R = Math.sqrt(3)/3*a;
		System.out.println("Площадь треугольника: "+ S);
		System.out.println("Высота треугольника равна: " + h);
		System.out.println("Радиус вписанного треугольника равен: "+r);
		System.out.println("Радиус описанного треугольника равен: "+R);
	}

}
