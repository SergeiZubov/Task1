package Matrix.BlueOrRed.DikiMatrix;

import java.util.Random; // ������ �� ������ ����� �� ���
import java.util.Scanner;

/*� ������� 1�12 ������������ ���������� ������� ������� n �� ��������� ������� 6.8.1.1*/

public class Main {
	static String s = "������� ������ �������";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(s);

		int a;
		for (;;) {
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.println(s);
			}
			a = sc.nextInt();
			if (0 < a && a % 2 == 0) {
				break;
			} else
				System.out.println(s);
		}
		System.out.println("������ �������: " + a + " � " + a);
		int mass[][] = new int[a][a];
		int b = mass.length - 2;
		int c = 1;
		for (int i = 0; i <= b; i += 2) {
			for (int j = 0; j < mass[i].length; j++) {
				mass[i][j] = j + 1;
			}
			for (int k = mass.length - 1; 0 <= k; k--) {
				mass[i + 1][k] = c;
				c++;
			}
			c = 1;
		}
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass.length; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println("");
		}
	}
}