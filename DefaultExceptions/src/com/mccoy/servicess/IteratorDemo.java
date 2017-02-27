package com.mccoy.servicess;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		
		ArrayList l=new ArrayList();
		
		for(int i=1;i<=10;i++)
		{
			l.add(i);
			
		}
		System.out.println("before iterating " +l);
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			Integer m=(Integer)itr.next();
			if((m%2)==0)
			{
				System.out.println("After iterating "+m);
				System.out.println("hi");
			}
		}
				
		
		
	}

}
