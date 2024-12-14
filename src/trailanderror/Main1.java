package trailanderror;

import java.util.*;
public class Main1 {
	public static void main(String[]args)
	{
		//arraylist in arraylist
		ArrayList<ArrayList> q = new ArrayList<>();
		for(int i=0;i<3;i++)
		{
			q.add(new ArrayList());
		}
		q.get(0).add(23);
		q.get(1).add("string");
		q.get(1).add("qwerty");
		q.get(2).add(23.5);
		q.get(2).add(321.5);
		System.out.println(q.get(2).get(1));
		System.out.println(q.get(2));
	}

}
