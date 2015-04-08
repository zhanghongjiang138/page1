package com.zhj;

import java.util.HashMap;
import java.util.Map;


//归并排序
public class Test4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int[] a={1,2,3,4,5,2,4,6546,234,12,213,43,546,534345,4};
		int[] temp=new int[a.length];
		mergSort(a,0,a.length-1,temp);
		
		for(int i=0;i<temp.length;i++){
			System.out.println(temp[i]);
		}
	}
	
	static void mergArray(int a[],int first,int mid,int last,int temp[]){
		int i,j,m,k;
		i=first;
		j=mid+1;
		m=mid+1;
		k=0;
		while(i<mid&&j<last){
			if(a[i]<a[j]){
				temp[k++]=a[i++];
			} 
			else{
				temp[k++]=a[j++];
			}
		}
		
		while(i<mid){
			temp[k++]=a[i++];				
		}
		
		while(j<last){
			temp[k++]=a[j++];				
		}
		
		for(i=0;i<k;i++){
			a[first+i]=temp[i];
		}
	}
	
	static void mergSort(int[] a,int first,int last,int[] temp){
		if (first < last) {
		 int mid=(last+first)/2;
		 mergSort(a,first,mid,temp);
		 mergSort(a,mid+1,last,temp);
		 mergArray(a,first,mid,last,temp);
		}
	}

}
