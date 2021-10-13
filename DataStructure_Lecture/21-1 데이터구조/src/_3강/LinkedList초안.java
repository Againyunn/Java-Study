//node�� �����ϴ� �ൿ�� �����ϴ� Ŭ����
��;

public class LinkedList�ʾ�{
	public LinkedList�ʾ�() // ������ : python���� __init__ ���� �Է¹��� �������� ���� �Է��ϴ� �Ͱ� ����� ������ ������ ����
	{
		Head = null; //
	}
	private Nodes Head = null; // ó���� head�� ���� ����״ٰ�, �ڿ� ��尡 ����� ����� �ּҸ� ��´�. 
	// �� head���� �������� �����Ͱ� ���� �ʴ´�. 
	
	public class Nodes //Nodes.java�� Ŭ������ ������ ����
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
	
	/*Nodes head;//������ Nodes�� Ŭ������ ���������Ƿ� 
	
	void insert(int data)//return ���� �ʿ����� �����Ƿ� void ������ ���·� �Լ�(�޼ҵ�) ���� 
	{
		Nodes newNode = new Nodes();
		newNode.data = data; // ������(head)�� newNodes.data���� data�̴�.
		
		head.next = newNode;
	}*/
	

