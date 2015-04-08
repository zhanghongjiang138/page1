package com.zhj;

public class TT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a=3;
		int b=0;
		try{
			a=a+1;
		}
		 catch(Exception e){
		 }
		finally{
			a=a+1;
			a=a/b;
			a=a+1;
		}
		
		System.out.println(a);
	}

}
