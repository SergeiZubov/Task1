package SixTwo.One;

import java.util.Scanner;

/*���� ��� ���� ������������ (� ��������).
 *����������, ���������� �� ����� �����������, � ���� ��, �� ����� �� �� �������������.*/

public class Third {
	static Scanner sc = new Scanner(System.in);
	
	public static void Print() {
		System.out.println("������� ����� ����� ");
	}
	
	public static int Test() {
		while(!sc.hasNextInt()) {
			sc.next();
			Print();
		}
		return 0;
	}
	
	public static void Test2(int a,int b) {
		if ((0<=a&&a<=180)&&(0<=b&&b<=180)) {
			if ((a+b)==90) {
				System.out.println("����������� �������������");
				return;
			}if ((a+b)<180) {
				System.out.println("����������� ����������");
			}else System.out.println("����� 3-� ����� ������������ ������ ���� 180 ��������, � ��� � 2 ����������");
		}else System.out.println("������ ������������ �� ����������");
	}
	
	public static void main(String[] args) {
		Print();
		int a = Test();
		a = sc.nextInt();
		
		Print();
		int b = Test();
		b = sc.nextInt();
		
		Test2(a,b);
		
	}
}
