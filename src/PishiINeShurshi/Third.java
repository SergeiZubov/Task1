package PishiINeShurshi;

/*Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.*/

import java.util.Scanner;

public class Third {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите радиус:");
		int R = sc.nextInt();
		double S = Math.PI*Math.pow(R, 2);
		double P = 2*Math.PI*R;
		System.out.println("Площадь круга равна: "+S);
		System.out.println("Длинна окрусжности составляет: "+P);
		
	}

}
