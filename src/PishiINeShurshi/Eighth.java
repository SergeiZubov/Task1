package PishiINeShurshi;

import java.util.Scanner;

/*���� ����� ����� ����. ����� ������� �����, ������� ������ ����������� � ����� ����� ����.*/

public class Eighth {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("������� ����� �����:");
		int a = sn.nextInt();
		int S1 = a*a;
		int S2 = a*a*6;
		int V = (int) Math.pow(a, 3);
		System.out.println("������� ����� = "+S1+
				"\n����� ������� ���� = "+S2+
				"\n����� ���� = "+V);
	}

}
