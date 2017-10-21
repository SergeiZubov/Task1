package PishiINeShurshi;

/*¬вести любой символ и определить его пор€дковый номер, а также указать предыдущий и последующий символы.*/

import java.util.Scanner;

public class Tenth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите любую хуебень: ");
		String s = sc.nextLine();
		int a = (int)s.charAt(0);
		char a1 = (char)a;
		int b = a-1;
		int c = a+1;
		System.out.println(a+" = "+a1+" "+b+" "+c);
		
	}

}
