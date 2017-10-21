package PishiINeShurshi;

/*Найти произведение цифр заданного четырехзначного числа.*/

import java.util.Scanner;

public class Fourth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите четырехначное число:");
		int a = sc.nextInt();
		String b = String.valueOf(a);
		int c = 1;
			for (int i=0;i<b.length();i++) {
				c = c*Character.getNumericValue(b.charAt(i));
			}
			System.out.println(c);
	}

}
