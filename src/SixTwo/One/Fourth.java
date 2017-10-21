package SixTwo.One;

import java.util.Random;

/*Даны действительные числа х и у, не равные друг другу. 
 *Меньшее из этих двух чисел заменить половиной их суммы, а большее — их удвоенным произведением.*/

public class Fourth {

	public static int setRandomValue() {
		Random rand = new Random();
		int a = rand.nextInt(50);
		return a;
	}

	public static double halfOfSumm(double a, double b) {
		return (a + b) / 2;
	}

	public static double halfOfMultiplication(double a, double b) {
		return (a * b) * 2;
	}

	public static void Result(double a, double b) {
		if (a < b) {
			double c = halfOfSumm(a, b);
			double d = halfOfMultiplication(a, b);
			System.out.println("Половина суммы = " + c + "\nУдвоенное произведение = " + d);
		} else if (a == b) {
			System.out.println("Нежданчик, да?");
		}else
		{
			double c = halfOfMultiplication(a, b);
			double d = halfOfSumm(a, b);
			System.out.println("Половина суммы = " + d+ "\nУдвоенное произведение = " + c);
		}
	}

	public static void main(String[] args) {
		double a = setRandomValue();
		double b = setRandomValue();

		System.out.println("a = " + a + "\nb = " + b);

		Result(a, b);
	}
}
