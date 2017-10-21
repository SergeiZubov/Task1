package TRUseki;

import java.util.Scanner;

/*—умма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.*/

public class First {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите целое чиало: ");		
			int[] mas = new int [4];
			for (int i=0; i<mas.length;i++) {
				while(!sc.hasNextInt()) {
					sc.next();
					System.out.println("¬ведите целое число: ");
				}
				mas[i]=sc.nextInt();
			}
			if (mas[0]+mas[1]==mas[2]+mas[3]) {
				System.out.println("True");
			}else System.out.println("False");
	}

}
