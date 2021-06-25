package com.ashik.collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> lhm=new TreeMap<Integer,String>();
		lhm.put(100, "One");
		lhm.put(200, "Two");
		lhm.put(100, "Three");
		lhm.put(400, "Four");
		lhm.put(500, "our");
		lhm.put(600, "your");
		lhm.put(700, "mour");
		System.out.println(lhm);
		Set set=lhm.keySet();
		Iterator<Integer>itr=set.iterator();
		while(itr.hasNext()) {
			int key=itr.next();
			String value=lhm.get(key);
			System.out.println(key+" "+value);
		}
		//System.out.println(set);
		/*String s=lhm.get(100);
		System.out.println(s);*/
	}

}
