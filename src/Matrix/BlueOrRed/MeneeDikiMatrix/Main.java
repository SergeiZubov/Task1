package Matrix.BlueOrRed.MeneeDikiMatrix;

/*� ������� 1�12 ������������ ���������� ������� ������� n �� ��������� ������� 6.8.1.2*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		MethodsNasheVsio ogo = new MethodsNasheVsio();
		Scanner sc = new Scanner(System.in);
		String s = "������� ������ �������: ";
		ogo.Print(s);
		int a = ogo.TestNa();
		int arr[][] = new int[a][a];
		int b = arr.length;
		for (int i = 0; i < arr.length; i++) {
			arr[i][b - 1] = i + 1;
			b--;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println("");
		}
	}
}
