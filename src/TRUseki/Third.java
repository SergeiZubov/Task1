package TRUseki;

import java.util.Scanner;

/*����� ����� N �������� ������ ���������� ������.*/

public class Third {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����� �����: ");
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.println("������� ����� �����: ");
		}
		int N = sc.nextInt();
		if (N%2==0) {
			System.out.println("True");
		}else System.out.println("False");
	}

}
