package SixThree.One.Two;

/*�������� ���������, ����������� �� ��������� ����� ����� ���������� ��������� ����� ��� ��������.*/

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
