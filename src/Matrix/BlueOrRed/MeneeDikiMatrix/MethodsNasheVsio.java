package Matrix.BlueOrRed.MeneeDikiMatrix;

import java.util.Scanner;

public class MethodsNasheVsio {
	Scanner sc = new Scanner(System.in);
	String s = "¬ведите размер массива: ";

	void Print(String s) {
		System.out.println(s);
	}

	int a;

	int TestNa() {
		for (;;) {
			while (!sc.hasNextInt()) {
				sc.next();
				Print(s);
			}
			a = sc.nextInt();
			if (0 < a) {
				return a;
			} else {
				Print(s);
			}
		}
	}

}
