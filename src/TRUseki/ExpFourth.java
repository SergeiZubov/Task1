package TRUseki;

import java.util.Random;
import java.util.Scanner;

/*Все цифры данного четырехзначного числа N различны.*/

public class ExpFourth {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		Random rand = new Random(); // массив планируется заполнять рандомом
		
		int[] array = new int[5]; // создаёт массив размером 25 ячеек

		/*for (int i = 0; i < array.length; i++) {
			System.out.println("Введите целое число");
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.println("Попробуйте ещё раз");
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