//node를 연결하는 행동을 관리하는 클래스
package _3강;

public class LinkedList초안{
	public LinkedList초안() // 생성자 : python에서 __init__ 으로 입력받을 데이터의 형태 입력하는 것과 비슷한 형태인 것으로 추정
	{
		Head = null; //
	}
	private Nodes Head = null; // 처음엔 head의 값을 비워뒀다가, 뒤에 노드가 생기면 노드의 주소를 담는다. 
	// 즉 head에는 실제적인 데이터가 들어가지 않는다. 
	
	public class Nodes //Nodes.java의 클래스와 동일한 구조
	{
		private Nodes next;
		private int data;
		Nodes(int d)
		{
			next=null;
			data=d;
		}
		public int getData()
		{
			return data;
		}
	}
}
	
	/*Nodes head;//기존에 Nodes로 클래스를 정의했으므로 
	
	void insert(int data)//return 값이 필요하지 않으므로 void 데이터 형태로 함수(메소드) 선언 
	{
		Nodes newNode = new Nodes();
		newNode.data = data; // 시작점(head)가 newNodes.data에서 data이다.
		
		head.next = newNode;
	}*/
	

