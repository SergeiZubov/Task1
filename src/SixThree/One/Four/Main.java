package SixThree.One.Four;

/*��� ������ ��������� ����� (0 � 9) ������� ��������������� �� �������� �� ���������� �����
 *(0 � zero, 1 � one, 2 � two,... )*/

public class Main {
	static Methods met = new Methods();

	public static void main(String[] args) {
		met.Print();
		int a = met.Test2();
		met.Result(a);
	}
}
