��;
import java.util.*; //Scanner�� ������ util�� ��� package�� import�Ѵٴ� �ǹ�

public class pizza {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ȳ��ϼ���. �������Դϴ�.");
		System.out.println("���ڸ� �ֹ����ּ���.");
		System.out.println("�󸶳� ū �����Դϱ�?");
		
		Scanner scan = new Scanner(System.in);
		int Jirum = scan.nextInt();
		Circle pizza = new Circle(Jirum);
		pizza.r=Jirum/2;
		double size = pizza.area();
		
		Circle mh = new Circle(10); //
		mh.r=10; //Circle�� �ν��Ͻ� mh�� ���� r�� 10�̶�� ���� �ο�
		
		System.out.println("����"+size+"�Դϴ�.");
		System.out.println("��Ȧ�� ������ = "+mh);
		
		scan.close();		
	}
}