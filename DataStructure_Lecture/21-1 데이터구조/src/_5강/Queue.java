
��;
import _3��.Node;
import _4��.LinkedList;

public class Queue {
	
	private LinkedList buffer;
	Queue()
	{
		buffer= new LinkedList();
	}
	
	public void Enqueue(int data)
	{
		//buffer�� �����͸� �߰�
		buffer.insert(data);
	}
	public int Dequeue() //queue���� ���� ���� �Լ�
	{
		int data=buffer.getData(0);
		buffer.deleteAt(0);
		return data;
		
	}
	public int length() //queue�� ���� ���� ����ϴ� �Լ�
	{
		return 0;
	}
	public void reverseEnqueue(int data)
	{
		buffer.insertHead(data);
	}
	public int reverseDequeue()
	{
		int data = buffer.getData(0);
		return 0;
		
	}
}
