package SixThree.One.Two;

/*Написать программу, позволяющую по последней цифре числа определить последнюю цифру его квадрата.*/

public class Main {
	
	static Methods metod = new Methods();	
	public static void main(String[] args) {
		
		metod.Print();
		
		metod.Test();
		
		int a = metod.Value();
		a= a%10;
		System.out.println(metod.Result(a));
		
	}
		
}
