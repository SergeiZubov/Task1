package PishiINeShurshi;

/*��������� ����� ���������� � ������� ����� ������ � ���� �� ��������� ������� R.*/

import java.util.Scanner;

public class Third {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������:");
		int R = sc.nextInt();
		double S = Math.PI*Math.pow(R, 2);
		double P = 2*Math.PI*R;
		System.out.println("������� ����� �����: "+S);
		System.out.println("������ ����������� ����������: "+P);
		
	}

}
