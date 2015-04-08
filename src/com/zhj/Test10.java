package com.zhj;

public class Test10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] intArray=new int[10000000];
		long beforeExcute=System.currentTimeMillis();
		for(int i=0;i<10000000;i++){
			intArray[i]=i;
		}
		for(int i=0;i<10000000;i++){
			if(i==intArray[i]){
				System.out.println(beforeExcute);
				
			}
		}
		long afterExcute=System.currentTimeMillis();
		System.out.println(afterExcute);
		System.out.println(afterExcute-beforeExcute);
		

	}

}
