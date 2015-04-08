package com.zhj;

import java.text.SimpleDateFormat;
import java.util.Date;



public class Test9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date date =new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yy HH:mm:ss");
		if(date instanceof java.util.Date){
			
			System.out.println(date);
			System.out.println("SimpleDateFormat:"+format.format(date));
		}
		
		String docNumResult="dsafa@jlj@gsdf";
		String[] arrays=docNumResult.split("@");
		System.out.println(arrays[0]+"   "+arrays[1]);
		

	}

}
