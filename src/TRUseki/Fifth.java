package TRUseki;
/*(x1, y1) и (х2, y2) — координаты левой верхней и правой нижней вершин прямоугольника. 
 * Точка А(х, у) принадлежит прямоугольнику.*/

import java.util.Random;
import java.util.Scanner;

public class Fifth {
	public static void main(String[] args) {
		int x1 = 1;
		int y1 = 1;
		int x2 = 15;
		int y2 = 15;
		Random rand = new Random();
		int x3 = rand.nextInt(25);
		int y3 = rand.nextInt(25);
		System.out.println(x3+" "+y3);
		System.out.println(x3+" "+y3);
		if (x1 < x3 && x3 < x2 && y1 < y3 && y3 < y2) {
			System.out.println("True");
		}else System.out.println("False");
	}

}
