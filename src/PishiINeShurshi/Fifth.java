package PishiINeShurshi;

/*���� ��� �����. ����� ������� �������������� ����� ���� ����� � ������� �������������� ������� ���� �����.*/

import java.util.Scanner;

public class Fifth {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("������� ������ �����:");
		int a = sn.nextInt();
		System.out.println("������� ������ �����:");
		int b = sn.nextInt();
		double ariMean = (Math.pow(a, 3) + Math.pow(b, 3))/2;
		System.out.println("������� ��������������: "+ariMean);
		double geoMean = Math.sqrt(Math.abs(a)*Math.abs(b));
		System.out.println("������� ��������������: "+geoMean);
		
	}

}
