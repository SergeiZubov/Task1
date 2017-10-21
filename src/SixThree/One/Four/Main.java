package SixThree.One.Four;

/*ƒл€ каждой введенной цифры (0 Ч 9) вывести соответствующее ей название на английском €зыке
 *(0 Ч zero, 1 Ч one, 2 Ч two,... )*/

public class Main {
	static Methods met = new Methods();

	public static void main(String[] args) {
		met.Print();
		int a = met.Test2();
		met.Result(a);
	}
}
