package _3강;

public class Circle {
	double r;
	double pi=3.1415;
	
	Circle(double input) //생성자 만들기
	{
		r = input;
	}
	
	double round() //void가 아니므로 반드시 return 값 지정이 필요하다.
	{
		double rr=2*r*pi;
		return rr;
	}
	double area()
	{
		return r*r*pi;
	}

}
