package PishiINeShurshi;

/*������ ���������� ���� ������ ������������ (x1, y1), (�2, y2), (x3, y3). ����� ��� �������� � �������.*/

import java.util.Scanner;

public class Second{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������� ���������� �1:");
		
		double x1 = scanner.nextInt();
		
		System.out.println("������� ���������� y1:");
		
		double y1 = scanner.nextInt();
		
		System.out.println("������� ���������� �2:");
		
		double x2 = scanner.nextInt();
		
		System.out.println("������� ���������� y2:");
		
		double y2 = scanner.nextInt();
		
		System.out.println("������� ���������� �3:");
		
		double x3 = scanner.nextInt();
		
		System.out.println("������� ���������� y3:");
		
		double y3 = scanner.nextInt();
		
		double a = Math.sqrt(Math.pow(x1-x2, 2)*Math.pow(y1-y2, 2));//���� ������� �
		double b = Math.sqrt(Math.pow(x2-x3, 2)*Math.pow(y2-y2, 2));//���� ������� b
		double c = Math.sqrt(Math.pow(x3-x1, 2)*Math.pow(y3-y1, 2));//���� ������� �
		
		double P = a + b + c; // ���� ��������
		double p = (a + b + c)/2; //���� ������������
		double S = Math.sqrt(p*(p-a)*(p-b)*p-c);
		System.out.println(P);
		System.out.println(S);
		
	}
}