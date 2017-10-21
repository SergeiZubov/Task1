package TRUseki;

import java.util.Random;
import java.util.Scanner;

/*Все цифры данного четырехзначного числа N различны.*/

public class Fourth {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		Random rand = new Random(); // массив планируется заполнять рандомом
		
		int[] array = new int[25]; // создаёт массив размером 25 ячеек

		/*for (int i = 0; i < array.length; i++) {
			System.out.println("Введите целое число");
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.println("Попробуйте ещё раз");
			}
			array[i] = sc.nextInt();
		}*/
		for (int i=0;i<array.length;i++) { // заполнение массива через цикл
			array[i]=rand.nextInt(200);     // заполнение массива значениями от 0 до 49
			System.out.print(array[i]+"  "); // распечатывает получившийся массив 
		}
		boolean a = true;
		for (int i = 0; i < array.length - 1; i++) {			
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {        //поиск совпадений
					System.out.println(i+" "+j);   //выводит индексы совпадений
					a = false;
					break;
				}
			}
		}
		System.out.println(a);
	}
}