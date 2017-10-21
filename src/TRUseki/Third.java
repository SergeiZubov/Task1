package TRUseki;

import java.util.Scanner;

/*÷елое число N €вл€етс€ четным двузначным числом.*/

public class Third {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬вдите целое число: ");
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.println("¬ведите целое число: ");
		}
		int N = sc.nextInt();
		if (N%2==0) {
			System.out.println("True");
		}else System.out.println("False");
	}

}
