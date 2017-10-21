package SixThree.One.Two;

import java.util.Scanner;

public class Methods {
	Scanner sc = new Scanner(System.in);
	void Print() {
		System.out.println("¬ведите целое число: ");
	}
	void Test() {
		while(!sc.hasNextInt()) {
			sc.nextLine();
			Print();
		}
	}
	int  Value() {
		int a = sc.nextInt();
		return a;
	}
	int Result(int a) {
		a = a%10;
		a = (int) Math.pow(a, 2);
		a = a%10;
		return a;		
	}
}
