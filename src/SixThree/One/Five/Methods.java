package SixThree.One.Five;

import java.util.Scanner;

/*—оставить программу, котора€ по данному числу (1Ч12) выводит название соответствующего ему мес€ца.*/

public class Methods {
	Scanner sc = new Scanner(System.in);

	void Print() {
		System.out.println("¬ведите номер мес€ца(1 до 12): ");
	}

	void Test() {
		while (!sc.hasNextInt()) {
			sc.next();
			Print();
		}
	}

	int Value() {
		int a = sc.nextInt();
		return a;
	}
	
	int trueValue() {
		int a;
		for(;;) {
			a = Value();
			if(0<a&&a<=12) {
				break;				
			}else {
				Print();
				Test();				
			}
		}
		return a;		
	}
	
	void Result() {
		int a = trueValue();
		String mounth;
		switch (a) {
		case 1:
			mounth = "January";
			System.out.println(a+" - "+mounth);
			break;
		case 2:
			mounth = "February";
			System.out.println(a+" - "+mounth);
			break;
		case 3:
			mounth = "March";
			System.out.println(a+" - "+mounth);
			break;
		case 4:
			mounth = "April";
			System.out.println(a+" - "+mounth);
			break;
		case 5:
			mounth = "May";
			System.out.println(a+" - "+mounth);
			break;
		case 6:
			mounth = "June";
			System.out.println(a+" - "+mounth);
			break;
		case 7:
			mounth = "July";
			System.out.println(a+" - "+mounth);
			break;
		case 8:
			mounth = "August";
			System.out.println(a+" - "+mounth);
			break;
		case 9:
			mounth = "September";
			System.out.println(a+" - "+mounth);
			break;
		case 10:
			mounth = "October";
			System.out.println(a+" - "+mounth);
			break;
		case 11:
			mounth = "November";
			System.out.println(a+" - "+mounth);
			break;
		case 12:
			mounth = "December";
			System.out.println(a+" - "+mounth);
			break;
			
		}
	}
	
}
