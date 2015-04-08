package com.zhj;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeSet;
import java.util.WeakHashMap;

public class Test2 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		
/*		boolean a=false;
		boolean b=false;
		boolean c=false;
		boolean d=false;
		boolean e=false;*/
/*		int a=0;
		int b=0;
		int c=0;
		int d=0;
		int e=0;*/
		for(int a=0;a<=1;a++){
			for(int b=0;b<=1;b++){
				for(int c=0;c<=1;c++){
					for(int d=0;d<=1;d++){
						for(int e=0;e<=1;e++){
							if(((a==1&&b==1)||(a==0))){
								if((b+c)==1){
									if(((c+d)==2||(c+d)==0)){
										if((d+e)>=1){
											if((e==1&&(a==1&&d==1))||e==0){
												System.out.println("a="+a);
												System.out.println("b="+b);
												System.out.println("c="+c);
												System.out.println("d="+d);
												System.out.println("e="+e);
											}
											
										}
										
									}
								}
							}



						}

					}

				}

			}
			
		}
		

	}

}
