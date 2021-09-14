package _5강;
import _3강.Node;
import _4강.LinkedList;

public class Queue {
	
	private LinkedList buffer;
	Queue()
	{
		buffer= new LinkedList();
	}
	
	public void Enqueue(int data)
	{
		//buffer에 데이터를 추가
		buffer.insert(data);
	}
	public int Dequeue() //queue에서 값을 빼는 함수
	{
		int data=buffer.getData(0);
		buffer.deleteAt(0);
		return data;
		
	}
	public int length() //queue의 원소 수를 출력하는 함수
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
