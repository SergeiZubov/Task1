package TRUseki;

import java.util.Random;
import java.util.Scanner;

/*��� ����� ������� ��������������� ����� N ��������.*/

public class Fourth {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		Random rand = new Random(); // ������ ����������� ��������� ��������
		
		int[] array = new int[25]; // ������ ������ �������� 25 �����

		/*for (int i = 0; i < array.length; i++) {
			System.out.println("������� ����� �����");
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.println("���������� ��� ���");
			}
			array[i] = sc.nextInt();
		}*/
		for (int i=0;i<array.length;i++) { // ���������� ������� ����� ����
			array[i]=rand.nextInt(200);     // ���������� ������� ���������� �� 0 �� 49
			System.out.print(array[i]+"  "); // ������������� ������������ ������ 
		}
		boolean a = true;
		for (int i = 0; i < array.length - 1; i++) {			
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {        //����� ����������
					System.out.println(i+" "+j);   //������� ������� ����������
					a = false;
					break;
				}
			}
		}
		System.out.println(a);
	}
}