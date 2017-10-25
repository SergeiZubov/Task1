package Matrix.BlueOrRed.TakSebeMatrix;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите размер массива: ");
		int a;
		for(;;) {
			while(!sc.hasNextInt()) {
				sc.next();
				System.out.println("¬ведите размер массива: ");
			}
			a = sc.nextInt();
			if (0<a) {
				break;
			}else System.out.println("¬ведите размер массива: ");
		}
		int arr[][] = new int [a][a];
		int b=1;
		for (int i = 0;i<arr.length;i++) {
			for (int j=0;j<a;j++) {
				arr[i][j] = b;
			}
			a--;
			b++;
		}
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr.length;j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println("");
		}
	}
}
