package DSA;

class node {
	int data;
	node next;
}
public class Stack 
{
	private node top = null;
	node top = null;
	void push(int d)
	{
		node n = new node();
		n.data = d;
		if(top==null)
		{
			top = n;
		}
		else
		{
			n.next = top;
			top = n;
			//top.next = n;
		}
	}
	int pop()
	{
		int a = top.data;
		top = top.next;
	}
	int peek()
	{
		return top.data;
	}

}
