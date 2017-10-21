package SixTwo.One;

import java.util.Scanner;

/*������ ���������� ���� ������������ �� ���������� �������:
 *�� ��������� �� � ����� � ����� � � ���., 
 *� ��������� ����� ������������� ����� ������������ �� ������� � ���. �� ������.
 *�������� ���������, ����������� ����� �� ����������� ��������� ��� ���������� ������� ���������� �� �����.*/

public class Fifth {
	static String h = "�����: ";
	static String m = "�����: ";
	static String s = "������: ";
	static Scanner sc = new Scanner(System.in);
	
	public static void toDisplay(String a) {
		System.out.println(a);
	}

	public static int  Test() {
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.println("��������� �������: ");
		}
		return 0;		
	}

	public static void Print(String a) {
		System.out.println("������� ���������� " + a);

	}

	private static int convertToFullMinutes(int haurs, int minutes, int seconds) {
		int h;
		int m;
		if (seconds>0) {
			m=1;
		}else m=0;
		m = m+minutes+haurs*60;
		return m;
	}
	
	public static int Price(int a) {
		int exceed;
		int b;
		if (a<=800) {
			return a*15;
		}else {
			exceed = a-800;
			a=800;
			b = a*15 + exceed*20;
			return b;
		}
	}
	
	public static void main(String[] atgs) {
		Print(h);
		Test();
		int haurs = sc.nextInt();
		
		Print(m);
		Test();
		int minutes = sc.nextInt();
		
		Print(s);
		Test();
		int seconds = sc.nextInt();
		
		int fullmin = convertToFullMinutes(haurs, minutes, seconds);
		
		int summ = Price(fullmin);
		
		toDisplay("����� � ������: " + String.valueOf(summ));
	}
}
