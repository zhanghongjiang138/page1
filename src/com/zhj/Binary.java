package com.zhj;

public class Binary {

/*	private String  a1;
	private String  a2;
	Binary(int a,int b){
		this.a1=Integer.toBinaryString(a);
		this.a2=Integer.toBinaryString(b);
	}*/
	
	public static  String xOr(String m,String n){

		int num=0;
		int sub=0;
		String sb="";
		String temp;
		if(m.length()<n.length()){
			temp=m;
			m=n;
			n=temp;
		}
		num=n.length();
		sub=m.length()-n.length();
		if(sub>0){
		sb=m.substring(0, sub);
		}
	for(int i=0;i<num;i++){
		if(n.charAt(i)==m.charAt(sub+i)){
			sb=sb+"0";
		}
		else{
			sb=sb+"1";
		}
	}
	return sb;
	}
	
	
	
	
	
	public static void main(String[] args) {
		int[] arr={1,1,2,2,4,4,4,8,8};
		String sum=Integer.toBinaryString(arr[0]);
		String temp1="";
		for(int i=1;i<arr.length;i++){
			temp1=Integer.toBinaryString(arr[i]);
			sum=Binary.xOr(sum,temp1);
		}
		System.out.println(sum);
		
		
		
		
		
	}

}
