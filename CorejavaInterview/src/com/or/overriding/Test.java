package com.or.overriding;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	@SuppressWarnings({ "rawtypes" })
	public static void main(String[] args) {
		List l =new ArrayList();
		l.add(10);
		l.add("hhhh");
		l.add(20);
		l.add("ss");
		Iterator itr=l.iterator();
		while(itr.hasNext()){
			Object o = itr.next(); 
			if (o instanceof Integer) {
				System.out.println("Integer is :"+ o);
				
			}
			else if (o instanceof String) {
				System.out.println("String is :"+ o);
				
			}/*		
			
			
			String s="";
			int i = 0;
			if(itr.equals(new String())){
			 s=(String) itr.next();
			 System.out.println(s);
			}
			else if(itr.equals(i)){
			 i=(int) itr.next();
			System.out.println(i);
			}
			System.out.println(itr.toString());
*/		}
	}

}
