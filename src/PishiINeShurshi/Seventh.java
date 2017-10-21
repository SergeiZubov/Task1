package PishiINeShurshi;

import java.util.Scanner;

/*Даны два действительных числа х и у. Вычислить их сумму, разность, произведение и частное.*/

public class Seventh {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Введите целое число: ");
		int a = sn.nextInt();
		System.out.println("Введите ещё одно целое число");
		int b = sn.nextInt();
		int summ = a + b;
		int difference1 = a-b;
		int difference2 = b-a;
		int multiplication = a*b;
		double division1 = (double)a/b;
		double division2 = (double)b/a;
		System.out.println("Сумма = "+summ+"\nРазность1 = "+difference1+"\nРазность2 = "+difference2+"\nПроизведение = "+multiplication+
				"\nДеление1 = "+division1+"\nДеление2 = "+division2);
	}

}
