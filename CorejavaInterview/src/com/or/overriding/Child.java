package com.or.overriding;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;
import java.util.TreeSet;

public class Child {
	public static void main(String[] args) {
		/*HashMap h=new HashMap<>();
		h.put(null, "10");
		h.put(null, 20);
		h.put(null, 30);
		h.put(null, "10");
		h.put(null, 20);
		System.out.println(h);*/
		TreeSet t=new TreeSet();
//		t.put(null, 10);
//		t.put(11, "j");
//		t.put(10, 10);
		t.add(null);
		t.add(null);
		System.out.println(t);
//		Hashtable h=new Hashtable<>();
//		.put(10, null);
//		h.put("kk", "jj");
//		h.put(null, null);
//		System.out.println(h);
	}

}
