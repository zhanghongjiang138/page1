package com.zhj;

public class Test13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] num ={1,2,3,4,5,6,7,8};
		getArrange(num,0,4);

	}
	
	public static int[] getArrange(int[] num,int start,int end){
		
		if(start==end){
			for(int j=0;j<=end;j++){
				System.out.print(num[j]+" ");
			}
			System.out.println();
		}
		else{
			for(int i=start;i<end+1;i++){
				int temp=num[start];
				num[start]=num[i];
				num[i]=temp;
				getArrange(num,start+1,end);
				
				temp=num[start];
				num[start]=num[i];
				num[i]=temp;
				
			}
		}
		return num;
		
		

	}

}
