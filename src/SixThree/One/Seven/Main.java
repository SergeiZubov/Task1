package SixThree.One.Seven;

/*ѕусть элементами круга €вл€ютс€ радиус (первый элемент), диаметр (второй элемент)
 *и длина окружности (третий элемент). —оставить программу, 
 *котора€ по номеру элемента запрашивала бы его соответствующее значение и вычисл€ла бы площадь круга.*/

public class Main {
	static Methods met = new Methods();
	static String rad = met.rad;
	static String D = met.D;
	static String L = met.L;
	static String s = "¬ведите значение соответствующее исходным данным:" + "\n1 - " + rad + "\n2 - " + D + "\n3 - "
			+ L;
	static String S = "¬ведите значение";

	public static void main(String[] args) {

		met.Print(s);
		met.Test(met.dataSelection);
		int a = met.trueValue();
		met.Test(met.addData);
		int a1 = met.Value();
		if (a == 1) {
			double b = met.formulaRadius(a1);
			System.out.println(b);
		} else {
			if (a == 2) {
				double b = met.formulaDiametr(a1);
				System.out.println(b);
			} else {
				double b = met.formulaLine(a1);
				System.out.println(b);
			}
		}
	}
}
