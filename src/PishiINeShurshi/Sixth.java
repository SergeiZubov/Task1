package PishiINeShurshi;

import java.util.Scanner;

/*��������� ���������� ����� ����� ������� � ������� ������������ (x1, y1) � (x2, y2).*/

public class Sixth {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("������� ���������� x1:");
		int x1 = sn.nextInt();
		System.out.println("������� ���������� y1:");
		int y1 = sn.nextInt();
		System.out.println("������� ���������� x2:");
		int x2 = sn.nextInt();
		System.out.println("������� ���������� y2:");
		int y2 = sn.nextInt();
		int a = Math.abs(x1-x2);
		int b = Math.abs(y1-y2);
		double c = Math.sqrt((a*a)+(b*b));
		System.out.println(c);		
	}

}
