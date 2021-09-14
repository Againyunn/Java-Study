package _3강;
import java.util.*; //Scanner을 포함한 util의 모든 package를 import한다는 의미

public class pizza {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("안녕하세요. 피자집입니다.");
		System.out.println("피자를 주문해주세요.");
		System.out.println("얼마나 큰 피자입니까?");
		
		Scanner scan = new Scanner(System.in);
		int Jirum = scan.nextInt();
		Circle pizza = new Circle(Jirum);
		pizza.r=Jirum/2;
		double size = pizza.area();
		
		Circle mh = new Circle(10); //
		mh.r=10; //Circle의 인스턴스 mh의 인자 r에 10이라는 값을 부여
		
		System.out.println("돈은"+size+"입니다.");
		System.out.println("맨홀의 사이즈 = "+mh);
		
		scan.close();		
	}
}