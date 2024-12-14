package trailanderror;
import java.util.*;
public class Queue {
	public static void main(String[]args)
	{
		java.util.Queue a = new LinkedList<>();
		a.add(1);
		a.add(21);
		a.add(72);
		a.add(23);
		
		Iterator itr = a.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
  