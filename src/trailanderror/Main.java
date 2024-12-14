package trailanderror;

import java.util.*;

public class Main {
	public static void main(String[]args)
	{
		ArrayList arr = new ArrayList<>();
		arr.add(21);
		arr.add("String");
		arr.add('I');
		System.out.println(arr);
		arr.set(1, "Querty");
		System.out.println(arr);
		System.out.println(arr.get(1));
		
		//Hash Set Example
		
		HashSet set = new HashSet<>();
		set.add("jaa");
		set.add("PUSHPA");
		set.add("FACEPREP");
		set.add(2);
		set.add("PUSHPA");
		set.add('c');
		System.out.println(set);
		
		//LinkedHashSet gives the output in the order which is given;
		LinkedHashSet h = new LinkedHashSet<>();
		h.add("jaa");
		h.add("PUSHPA");
		h.add("FACEPREP");
		h.add(2);
		h.add('c');
		System.out.println(h);
		
		//in TreeSet every element should be same other wise it will shoe an error
		//and it will print in alphabetical order first capital then small
		TreeSet t = new TreeSet<>();
		t.add("Apple");
		t.add("jaa");
		t.add("PUSHPA");
		t.add("aa");
		t.add("FACEPREP");
		//t.add(2);
    	//t.add('c');
		System.out.println(t);
	}
	

}
