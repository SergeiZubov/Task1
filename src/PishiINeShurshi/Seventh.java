package PishiINeShurshi;

import java.util.Scanner;

/*���� ��� �������������� ����� � � �. ��������� �� �����, ��������, ������������ � �������.*/

public class Seventh {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("������� ����� �����: ");
		int a = sn.nextInt();
		System.out.println("������� ��� ���� ����� �����");
		int b = sn.nextInt();
		int summ = a + b;
		int difference1 = a-b;
		int difference2 = b-a;
		int multiplication = a*b;
		double division1 = (double)a/b;
		double division2 = (double)b/a;
		System.out.println("����� = "+summ+"\n��������1 = "+difference1+"\n��������2 = "+difference2+"\n������������ = "+multiplication+
				"\n�������1 = "+division1+"\n�������2 = "+division2);
	}

}
