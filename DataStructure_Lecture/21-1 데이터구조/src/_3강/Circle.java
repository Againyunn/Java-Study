��;

public class Circle {
	double r;
	double pi=3.1415;
	
	Circle(double input) //������ �����
	{
		r = input;
	}
	
	double round() //void�� �ƴϹǷ� �ݵ�� return �� ������ �ʿ��ϴ�.
	{
		double rr=2*r*pi;
		return rr;
	}
	double area()
	{
		return r*r*pi;
	}

}
