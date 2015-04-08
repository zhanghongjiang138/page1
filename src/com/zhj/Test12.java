package com.zhj;

public class Test12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count=0;
		for(int s =1000;s<9999;s++){
		int num[]=divide(s);
		
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				for(int m=0;m<4;m++){
					for(int n=0;n<4;n++){
						if(i==j||i==m||i==n||j==n||j==m||m==n){
							continue;
						}
						else{
							count++;
							if(s==(100*num[m]*num[i]+num[j]*num[n]+10*num[m]*num[j]+10*num[n]*num[i]))
							{	
							 System.out.println("该数为"+s);
							 System.out.println(num[m]+""+num[n]+"*"+num[i]+""+num[j]+"="+s);
							}
						}

						}
					}
				}
			}
		}
		System.out.println(count);

	
		/*for(int i =0;i<2;i++){
			for(int j=1;j<3;j++){
				num[i+j]
			}
		}*/
			

	}
	
	public static  int []  divide(int num){
		int length=Test12.getLength(num);
		int[] temp =new int[length];
		
		for(int i =0;i<length;i++){
			temp[i]=num-(num/10)*10;
			num=num/10;
			
			//System.out.println(temp[i]);

		}
		
		return temp;
		
		
	}
	public static int getLength(int num){
		if(num<1){
			return 0;
		}
		int j =0;
		
		for(int i =1;;i++){
			if(num>=1){
				j++;
				num=num/10;
			}
			
			else{
				return j;
			}
		}

		
	}
	
}
