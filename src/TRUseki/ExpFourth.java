package TRUseki;

import java.util.Random;
import java.util.Scanner;

/*��� ����� ������� ��������������� ����� N ��������.*/

public class ExpFourth {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		Random rand = new Random(); // ������ ����������� ��������� ��������
		
		int[] array = new int[5]; // ������ ������ �������� 25 �����

		/*for (int i = 0; i < array.length; i++) {
			System.out.println("������� ����� �����");
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.println("���������� ��� ���");
			}
			array[i] = sc.nextInt();
		}*/
		for (int i=0;i<array.length;i++) { 
			array[i]=rand.nextInt(12);     
			System.out.print(array[i]+"  "); 
		}
		System.out.println("");
		boolean a = returnTrueOrFalse(array);
		
		System.out.println(a);
	}

	public static boolean returnTrueOrFalse(int array[]) {
		boolean a = true;
		for (int i = 0; i < array.length - 1; i++) {			
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {        
					System.out.println(i+" "+j);  
					a = false;
				}
			}
		}
		return a;
	}
}