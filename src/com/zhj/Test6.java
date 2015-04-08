package com.zhj;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Test6 {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	
	
	public static void main(String[] args) throws ClassNotFoundException {
		StringBuffer sb=new StringBuffer("");
		sb.append("123");
		int i =Integer.parseInt(sb.toString());
		String s="344234";
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		LinkNode ln=new LinkNode(1);
		Class c=Class.forName("com.zhj.LinkNode");
		Field[] f=c.getFields();
		System.out.println(f.length);
		for(Field field:f){
			System.out.println(field.getName());
		}
		
		
	}

	public static int  StringToInt(String s){
		int sum=0;
		int num=0;
		for(int i =0;i<s.length();i++){
			sum=10*sum+(s.charAt(i)-'0');
		}
		
		return sum;
		
	}

}
