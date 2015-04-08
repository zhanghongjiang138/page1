package com.zhj;

public class Test11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i =1000;i<9999;i++){
			
			int[] num=new int[4];
			
			num[0]=i-(i/10)*10;
			num[1]=num[0]-(num[0]/10)*10;
			num[2]=num[1]-(num[1]/10)*10;
			num[3]=num[2]-(num[2]/10)*10;


			
		for(int m=0;m<4;m++){
				for(int n=0;n<4&&n!=m;n++){
					for(int k=0;k<4&&k!=m&&k!=n;k++){
						for(int l=0;k<4&&l!=m&&l!=n&&l!=k;l++){
							if((i==(100*num[m]*num[k]+num[n]*num[l]+10*num[m]*num[l]+10*num[n]*num[k])))
							{	System.out.println(i);
							 System.out.println(num[m]+""+num[n]+"*"+num[k]+""+num[l]+"="+i);
							}
						}
					}
				}
			}

			
			
			


			
		}
				
		
	}

}
