package com.zhj;

public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s=new String("hello");
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			System.out.println("the code on "+i+" position is :"+(int)c);
		}
		StringToInt("ha");
	}
	
	public static int  StringToInt(String s){
		int sum=0;
		for( int i =0 ;i<s.length();i++){
			sum=sum*10+(s.charAt(i)-'0');
		}
		
		System.out.println(sum);
		return sum;
	}

}
