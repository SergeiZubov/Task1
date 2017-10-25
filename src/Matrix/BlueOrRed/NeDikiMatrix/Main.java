package Matrix.BlueOrRed.NeDikiMatrix;

/*� ������� 1�12 ������������ ���������� ������� ������� n �� ��������� ������� 6.8.1.5*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������ �������: ");
		int a = 0;
		for(;;) {
			while(!sc.hasNextInt()) {
				sc.next();
				System.out.println("������� ������ �������: ");
			}
			a=sc.nextInt();
			if (0<a) {
				break;
			}else {
				System.out.println("������� ������ �������: ");
			}
		}
		int arr[][] = new int[a][a];
		for (int i=0;i<arr.length;i++) {
			arr[0][i]=1;
		}
		for(int i=1;i<arr.length-1;i++) {
			arr[i][0]=1;
			arr[i][arr.length-1]=1;
		}
		for(int i=0;i<arr.length;i++) {
			arr[arr.length-1][i]=1;
		}
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr.length;j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println("");
		}
	}

}
