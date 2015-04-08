package com.zhj;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeSet;
import java.util.WeakHashMap;

public class Test1 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		//LinkedList
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("a");
		ll.add("b");
		ll.addFirst("0");
		ll.add("c");
		for(String s:ll){
			System.out.println(s);
		}
		
		//HashSet
		HashSet<String> hs=new HashSet<String>();
		hs.addAll(ll);
		
		for(String q:hs){
			System.out.println(q);
		}
		
		//TreeSet
		TreeSet<String> ts =new TreeSet<String>();
		ts.addAll(ll);
		Iterator<String> iterator=ts.iterator();
		while(iterator.hasNext()){
			System.out.println("treeSet:"+iterator.next());
		}
		
		//HashMap and WeakHashMap
		Map<String, Object> map = new HashMap<String ,Object>();
		Map<String, Object> weakmap = new WeakHashMap<String ,Object>();
		String a=new String("a");
		String b=new String("b");

		map.put(a," I am a");
		map.put(b," I am b");
		
		weakmap.put(a,"I am a");
		weakmap.put(b,"I am b");
		a=null;
		b=null;
		System.gc();
		System.out.println("this is map");
		Iterator<?> iteratorMap =map.entrySet().iterator();
		while(iteratorMap.hasNext()){
			Map.Entry ma=(Map.Entry) iteratorMap.next();
			System.out.println(ma);
		}
		
		System.out.println("this is weak map");
		Iterator<?> iteratorwMap =weakmap.entrySet().iterator();
		while(iteratorwMap.hasNext()){
			Map.Entry wma=(Map.Entry) iteratorwMap.next();
			System.out.println(wma);
		}

	}

}
