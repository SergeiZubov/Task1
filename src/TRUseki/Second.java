package TRUseki;

import java.util.Scanner;

public class Second {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����� �����: ");
		int[] mas = new int[3];
		for(int i=0;i<mas.length;i++) {
			while(!sc.hasNextInt()) {
				sc.next();
				System.out.println("������� ����� �����: ");
			}
			mas[i] = sc.nextInt();
		}
		int sum=0;
		for (int i=0;i<mas.length;i++) {
			sum = sum+mas[i];
		}
		double sum1 = (double)sum/2;
		int sum2=(int)sum1;
		System.out.println("����� ���� ����� ������� = "+sum+"\n��������� ����� ���� ����� ������� = "+sum1);
		sum1 = sum1-sum2;
		if(sum1==0) {
			System.out.println("True");
		}else System.out.println("False");
	}

}
