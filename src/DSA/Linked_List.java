package DSA;

public class Linked_List {
	Stack head=null;
	Stack temp=null;
	void insert(int d)
	{
		Stack n=new Stack();
		n.data=d;
		if(head==null)
		{
			head=n;
			temp=n;
		}
		else
		{
			temp.next=n;
			temp=n;
		}
	}
	
	
	void remove_pos(int pos)
	{
		Stack t=head;
		int i=1;
		while(t!=null && i<pos-1)
		{
			t=t.next;
			i++;
		}
		if(t!=null && t.next!=null)
		{
			t.next=t.next.next;
		}
		else  if(t!=null)
		{
			t.next=null;
		}
	}
	void display()
	{
		Stack t=head;
		while(t!=null)
		{
			System.out.println(t.data +" ");
			t =t.next();
		}
	}

}