package SixThree.One.Four;

import java.util.Scanner;

public class Methods {
	Scanner sc = new Scanner(System.in);

	void Print() {
		System.out.println("¬ведите целое число от 0 до 9: ");
	}

	void Test() {
		while (!sc.hasNextInt()) {
			sc.next();
			Print();
		}
	}

	int Test2() {
		int a;
		for (;;) {
			Test();
			a = Value();
			if (0 <= a && a <= 9) {
				break;
			} else
				Print();
		}
		return a;
	}

	int Value() {
		int a = sc.nextInt();
		return a;
	}

	void Result(int a) {
		String num;
		switch (a) {
		case 0:
			num = "ZERO";
			System.out.print(a + " - " + num);
			break;
		case 1:
			num = "ONE";
			System.out.print(a + " - " + num);
			break;
		case 2:
			num = "TWO";
			System.out.print(a + " - " + num);
			break;
		case 3:
			num = "THREE";
			System.out.print(a + " - " + num);
			break;
		case 4:
			num = "FOUR";
			System.out.print(a + " - " + num);
			break;
		case 5:
			num = "FIVE";
			System.out.print(a + " - " + num);
			break;
		case 6:
			num = "SIX";
			System.out.print(a + " - " + num);
			break;
		case 7:
			num = "SEVEN";
			System.out.print(a + " - " + num);
			break;
		case 8:
			num = "EIGHT";
			System.out.print(a + " - " + num);
			break;
		case 9:
			num = "NINE";
			System.out.print(a + " - " + num);
			break;
		}
	}

}
