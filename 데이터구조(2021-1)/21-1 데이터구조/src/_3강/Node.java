package _3강;

public class Node {
	public Node next;//주소를 지칭하는 변수 Nodes 지정(연결고리)
	public int data;//실제 입력 받은 Block의 데이터(데이터)
	public Node(int d)
	{
		next = null;
		data = d;
	}

}
