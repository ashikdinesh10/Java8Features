package com.ashik.collections;


import java.util.Iterator;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2 {

	public static void main(String[] args) {
		NavigableMap<Integer, String> lhm=new TreeMap<Integer,String>();
		lhm.put(100, "One");
		lhm.put(200, "Two");
		lhm.put(100, "Three");
		lhm.put(400, "Four");
		lhm.put(500, "our");
		lhm.put(600, "your");
		lhm.put(700, "mour");
		System.out.println(lhm);
		/*Set set=lhm.keySet();
		Iterator<Integer>itr=set.iterator();
		while(itr.hasNext()) {
			int key=itr.next();
			String value=lhm.get(key);
			System.out.println(key+" "+value);
		}*/
		NavigableMap<Integer, String>ns=lhm.descendingMap();
		System.out.println(ns);
	}

}