package PishiINeShurshi;

/*������ ����� ������ � ���������� ��� ���������� �����, � ����� ������� ���������� � ����������� �������.*/

import java.util.Scanner;

public class Tenth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����� �������: ");
		String s = sc.nextLine();
		int a = (int)s.charAt(0);
		char a1 = (char)a;
		int b = a-1;
		int c = a+1;
		System.out.println(a+" = "+a1+" "+b+" "+c);
		
	}

}
