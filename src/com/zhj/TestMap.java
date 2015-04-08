package com.zhj;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] arr1={1,1,1,1,1,1,2,2,2,2,3,3,3,1,2222,144,144};
		int[] arr2={2,5};
		 int i=0X111;
/*		for(int j=1;i<arr1.length;i++){
			i=i^arr2[i];
		}*/
/*		int[] arr={1,1,1,1,1,1,2,2,2,2,3,3,3,1,2222,144,144};
		getSingleNumber(arr);*/
		System.out.println(args[0]);
		
		


	}
	
	public static void getSingleNumber(int[] arr){
		//arr={1,1,1,1,1,1,2,2,2,2,3,3,3,1,2222,144,144};
		//int[] brr=new int[arr.length];
		//int j=0;
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++){
			if(map.get(arr[i])==null){
				map.put(arr[i],1);
			//	brr[j++]=i;
			}
			else if(map.get(arr[i])!=null){
				map.put(arr[i],map.get(arr[i])+1);
			}
		}
		Iterator<?> iteratorwMap =map.entrySet().iterator();
		int m=0;
		while(iteratorwMap.hasNext()){
			Map.Entry im=(Map.Entry) iteratorwMap.next();
			int value =(Integer) im.getValue();

			if(value%2!=0){
				System.out.println(im.getKey());
				
				GregorianCalendar gc;
			}
		}
	}
	
	

	

}
