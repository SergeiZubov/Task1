package PishiINeShurshi;

/*Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.*/

public class First {
	public static void main(String[] args) {
		double a = 3;
		double b = 4;
		double c;
		double S;
		double P;
		c = Math.sqrt(a*a + b*b);
		P = a + b + c;
		S = a * b / 2;
		System.out.println(P);
		System.out.println(S);
		
	}

}
