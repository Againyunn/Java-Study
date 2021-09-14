package _4강;

import _3강.Node;
//import javax.xml.soap.Node;
//node를 연결하는 행동을 관리하는 클래스입니다.
public class LinkedList {	
	//새로운 Node 생성
	public Node head = null; //head는 중요한 값이므로 공개x , 외부에서 호출x
	public void insert(int data)//접근자: 누구나 접근가능하도록 , 데이터형태: void 리턴 값이 따로 존재x
	{
		Node newBlock = new Node(data);//local에 newBlock 데이터를 만들고, dynamic에  Node인 data와 next를 생성
		newBlock.data = data;
	
	//기존에 입력 된 데이터(Node) 중 마지막 Node의 위치(주소)를 알아야 한다.
	//Head(처음Node)부터 기존의 마지막Node까지 순차적으로 위치(주소)를 확인하여 마지막 Node에 새로운 Node의 주소를 입력해야 한다.
	//따라서 처음 Node의 위치를 알아야 한다.
	
	//맨 마지막 node와 그 외의 node간 차이점 : next가 비어 있으면(다음 node의 주소가 없으면) 마지막 node
		if(head == null) //처음 만든 Node가 첫번째 Node인경우 해당 노드를 헤드로 이용
		{
			head=newBlock; //새로운 node를 head로 삼는다는 의미
			return; //해당 함수 끝내기
		}
		
		Node current = head; //current를 head로 가정
		while(current.next != null) //current의 next가 0이 아닌 경우 반복
		{
			current = current.next;
		}
		current.next = newBlock;//while문을 통화하고나면(현 node체계의 가장 마지막) 새로운 node를 추가한다.
		
		//매번 새로운 블록(node)를 추가할 때마다 while문을 돌며 처음(head)부터 원소들을 조회한다.
	}
	
	public void insertHead(int data) //head의 값을 바꾸는 함수 짜보기
	{
		Node newBlock = new Node(data);
		newBlock.data = data;
		
		newBlock.next = head;
		head=newBlock;
		
		//기존의 head가 뒤로 밀리고 새로 삽입한 데이터가 head값이 되도옥 코드 구현
		/*Node newBlock = new Node(data);
		newBlock.data= data;
		
		Node current = head; // head (1) current (2)
		
		Node temp1 = head; //기존 head의 값을 임시 변수 temp에 저장
		head = newBlock; // head에 새로운 데이터(newBlock)의 주소 저장
		current = temp1; // current(2)에  head 데이터 입력
		
		while(current.next != null)
		{
			Node temp = current.next;
			current.next = newBlock;
			newBlock.next = temp;
		}
		//current = current.next;
		//System.out.println(current.data);
		
	
		//current.next (3)*/
		/*while(((current.next).next).next != null) //current 다음 값에 주소가 있는 경우 순환
		{
			
			//Node temp2 = current; //(3)
			
			(current.next).next = current.next;
			(current.next).data = current.data;
			
			
			System.out.println(current.data);
			System.out.println(current.next);
			System.out.println("*");
			//System.out.println("**");
			//System.out.println(current);
			//if (current.next == null)
				//break;
		}*/
		//current = current.next;
		//System.out.println("***");
		//print(); //print 클래스 실행(LinkedList의 모든 원소 반환)
	}
	
	
	public void print()//모두 출력하므로 인자x, 리턴값 x, 외부 공개 가능
	{
		Node current = head;
		while(current != null)
		{
			System.out.println(current.data);
			//System.out.println(current.next);
			current = current.next;
			
		}
	}
	public void printOne(int n) //특정 인덱스 출력 -> 내가 짠 코드0
	{
		Node current = head;
		for(int i =0; i<n; i++)
		{
			if (i==n-1)
			{
				System.out.println(i+"번 원소 : "+current.data);
			}
			current = current.next;
		}
	}
	
	public int getData(int idx) //특정 인덱스 출력 -> 교수님이 짜신 코드
	{
		Node current = head;
		
		for(int i = 0; i<idx; i++)
		{
			current = current.next;
		}
		return current.data;
			
	}
	public void insertAt(int idx, int data)
	{
		Node newBlock = new Node(data);
		newBlock.data = data;
		
		Node current = head;
		
		for(int i = 0; i<idx; i++)
		{
			current = current.next;
			//지금의 current는 현재 6을 가진 블럭을 지칭
			
			// 1번째 방법 : 새로운 변수에 임시 저장
			Node temp = current.next;
			current.next = newBlock;
			newBlock.next = temp;
			
			
			/* 2번째 방법 : 연산의 순서를 바꾸기
			 * newBlock.next = current.next;
			 * current.next = newBlock;
			 */
		}
	}

	public void deleteLast() 
	{
		
		if(head.next ==null)
			head =null;
		
		if(head == null)
			return;
		
		Node current = head;
		while(current.next.next !=null)
			current = current.next;//마지막에서 두번째에 위치한 블록의 특징 : 다음 블록의 next는 null이다.
		current.next= null; //당장은 deleteLast 전에 선언된 Node가 지줘지지 않지만, 해당 연산 이후에는 garbage collector에 의해 지워진다.
		// 마지막 Node를 찾아서, 마지막에서 두번째 Node의 next를 삭제
	}
	public void deleteAt(int idx)
	{
		if(head == null) //head값이 null인 경우(node가 입력되지 않은 경우)
			return;
		
		if(idx==0) //head의 다음 번째 node인 경우 head의 다음 주소를 가리키는 값을 head로 만들어버려서 head를 제거한다.
		{
			head=head.next;
		}
		
		Node current = head;
		for(int i =0; i<idx; i++)
			current = current.next;
		//for문을 돌면서 idx보다 1개 적은 index의 next를 지정한다.
		current.next = current.next.next; //해당 next에 다음번째 next를 저장한다.(중간 갑의 주소를 날려버리는 효과)
		
	}
	
	
}
