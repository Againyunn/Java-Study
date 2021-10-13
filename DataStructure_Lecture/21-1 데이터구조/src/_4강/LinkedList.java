��;

import _3��.Node;
//import javax.xml.soap.Node;
//node�� �����ϴ� �ൿ�� �����ϴ� Ŭ�����Դϴ�.
public class LinkedList {	
	//���ο� Node ����
	public Node head = null; //head�� �߿��� ���̹Ƿ� ����x , �ܺο��� ȣ��x
	public void insert(int data)//������: ������ ���ٰ����ϵ��� , ����������: void ���� ���� ���� ����x
	{
		Node newBlock = new Node(data);//local�� newBlock �����͸� �����, dynamic��  Node�� data�� next�� ����
		newBlock.data = data;
	
	//������ �Է� �� ������(Node) �� ������ Node�� ��ġ(�ּ�)�� �˾ƾ� �Ѵ�.
	//Head(ó��Node)���� ������ ������Node���� ���������� ��ġ(�ּ�)�� Ȯ���Ͽ� ������ Node�� ���ο� Node�� �ּҸ� �Է��ؾ� �Ѵ�.
	//���� ó�� Node�� ��ġ�� �˾ƾ� �Ѵ�.
	
	//�� ������ node�� �� ���� node�� ������ : next�� ��� ������(���� node�� �ּҰ� ������) ������ node
		if(head == null) //ó�� ���� Node�� ù��° Node�ΰ�� �ش� ��带 ���� �̿�
		{
			head=newBlock; //���ο� node�� head�� ��´ٴ� �ǹ�
			return; //�ش� �Լ� ������
		}
		
		Node current = head; //current�� head�� ����
		while(current.next != null) //current�� next�� 0�� �ƴ� ��� �ݺ�
		{
			current = current.next;
		}
		current.next = newBlock;//while���� ��ȭ�ϰ���(�� nodeü���� ���� ������) ���ο� node�� �߰��Ѵ�.
		
		//�Ź� ���ο� ���(node)�� �߰��� ������ while���� ���� ó��(head)���� ���ҵ��� ��ȸ�Ѵ�.
	}
	
	public void insertHead(int data) //head�� ���� �ٲٴ� �Լ� ¥����
	{
		Node newBlock = new Node(data);
		newBlock.data = data;
		
		newBlock.next = head;
		head=newBlock;
		
		//������ head�� �ڷ� �и��� ���� ������ �����Ͱ� head���� �ǵ��� �ڵ� ����
		/*Node newBlock = new Node(data);
		newBlock.data= data;
		
		Node current = head; // head (1) current (2)
		
		Node temp1 = head; //���� head�� ���� �ӽ� ���� temp�� ����
		head = newBlock; // head�� ���ο� ������(newBlock)�� �ּ� ����
		current = temp1; // current(2)��  head ������ �Է�
		
		while(current.next != null)
		{
			Node temp = current.next;
			current.next = newBlock;
			newBlock.next = temp;
		}
		//current = current.next;
		//System.out.println(current.data);
		
	
		//current.next (3)*/
		/*while(((current.next).next).next != null) //current ���� ���� �ּҰ� �ִ� ��� ��ȯ
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
		//print(); //print Ŭ���� ����(LinkedList�� ��� ���� ��ȯ)
	}
	
	
	public void print()//��� ����ϹǷ� ����x, ���ϰ� x, �ܺ� ���� ����
	{
		Node current = head;
		while(current != null)
		{
			System.out.println(current.data);
			//System.out.println(current.next);
			current = current.next;
			
		}
	}
	public void printOne(int n) //Ư�� �ε��� ��� -> ���� § �ڵ�0
	{
		Node current = head;
		for(int i =0; i<n; i++)
		{
			if (i==n-1)
			{
				System.out.println(i+"�� ���� : "+current.data);
			}
			current = current.next;
		}
	}
	
	public int getData(int idx) //Ư�� �ε��� ��� -> �������� ¥�� �ڵ�
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
			//������ current�� ���� 6�� ���� ���� ��Ī
			
			// 1��° ��� : ���ο� ������ �ӽ� ����
			Node temp = current.next;
			current.next = newBlock;
			newBlock.next = temp;
			
			
			/* 2��° ��� : ������ ������ �ٲٱ�
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
			current = current.next;//���������� �ι�°�� ��ġ�� ����� Ư¡ : ���� ����� next�� null�̴�.
		current.next= null; //������ deleteLast ���� ����� Node�� �������� ������, �ش� ���� ���Ŀ��� garbage collector�� ���� ��������.
		// ������ Node�� ã�Ƽ�, ���������� �ι�° Node�� next�� ����
	}
	public void deleteAt(int idx)
	{
		if(head == null) //head���� null�� ���(node�� �Էµ��� ���� ���)
			return;
		
		if(idx==0) //head�� ���� ��° node�� ��� head�� ���� �ּҸ� ����Ű�� ���� head�� ���������� head�� �����Ѵ�.
		{
			head=head.next;
		}
		
		Node current = head;
		for(int i =0; i<idx; i++)
			current = current.next;
		//for���� ���鼭 idx���� 1�� ���� index�� next�� �����Ѵ�.
		current.next = current.next.next; //�ش� next�� ������° next�� �����Ѵ�.(�߰� ���� �ּҸ� ���������� ȿ��)
		
	}
	
	
}
