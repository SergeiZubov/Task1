package PishiINeShurshi;

import java.util.Scanner;

/*Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.*/

public class Eighth {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Введите длину ребра:");
		int a = sn.nextInt();
		int S1 = a*a;
		int S2 = a*a*6;
		int V = (int) Math.pow(a, 3);
		System.out.println("Площадь грани = "+S1+
				"\nОбщая площадь куба = "+S2+
				"\nОбъём куба = "+V);
	}

}
