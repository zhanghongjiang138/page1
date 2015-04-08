package com.zhj;

public class Test7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{  
            System.out.println(1);  
            try{  
                System.out.println(2);  
                return;  
            }catch(Exception e){  
                System.out.println(3);  
            }finally{  
                System.out.println(4);  
                  
            }  
            System.out.println(5);  
        }catch(Exception e){  
            System.out.println(6);  
        }finally{  
            System.out.println(7);  
              
        }  

	}

}
