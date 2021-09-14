package _3강;

public class Nodes {
	public Nodes next;//주소를 지칭하는 변수 Nodes 지정(연결고리)
	public int data;//실제 입력 받은 Block의 데이터(데이터)
	Nodes(int d)
	{
		next = null;
		data = d;
	}
	public int getData() // 내부에 입력된 배열을 출력하는 메소드
	{
		return data;
	}

}
