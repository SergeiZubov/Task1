package PishiINeShurshi;

import java.util.Scanner;

/* ���� ������� ��������������� ������������.
 * ����� ������� ����� ������������, ��� ������, ������� ��������� � ��������� �����������.*/

public class Nineth {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("������� ������� ������������(����� �����): ");
		while(!sn.hasNextInt()) {
			sn.next();
			System.out.println("������� ��� ������ ����� �����: ");
		}
		int a = sn.nextInt();
		double h = Math.sqrt(Math.pow(a, 2)*Math.pow(a/2, 2));
		double S = a*h/2;
		double r = Math.sqrt(3)/6*a;
		double R = Math.sqrt(3)/3*a;
		System.out.println("������� ������������: "+ S);
		System.out.println("������ ������������ �����: " + h);
		System.out.println("������ ���������� ������������ �����: "+r);
		System.out.println("������ ���������� ������������ �����: "+R);
	}

}
