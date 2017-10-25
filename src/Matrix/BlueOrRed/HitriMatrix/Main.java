package Matrix.BlueOrRed.HitriMatrix;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("¬ведите размер массива: ");
		for (;;) {
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.println("¬ведите размер массива: ");
			}
			a = sc.nextInt();
			if (0 < a) {
				break;
			} else
				System.out.println("¬ведите размер массива: ");
		}
		int arr[][] = new int[a][a];
		int b = (int) Math.ceil(a / 2.0);
		int c = arr.length;
		int d;
		for (int i = 0; i < c; i++) {
			for (d = i; d < c; d++) {
				arr[d][i] = 1;
			}
			c--;
		}
		c = 0;
		for (int i = arr.length - 1; 0 <= i; i--) {
			for (d = i; d >= c; d--) {
				arr[d][i] = 1;
			}
			c++;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
}
