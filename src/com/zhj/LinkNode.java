package com.zhj;

import java.lang.reflect.Method;



public class LinkNode {
	//count the linkNode total number
	private static int count=0;
	public String name;
	public static int getCount() {
		return count;
	}
	 {
		 count++;
	 }
	private int value;

	private LinkNode nextNode;
	
	
	
	LinkNode(){

	}
	
	LinkNode(int value){
		this.value=value;	
	}
	
	LinkNode(LinkNode ld,int value){
		ld.value=value;
	}
	
	public LinkNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(LinkNode nextNode) {
		this.nextNode = nextNode;
	}

	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	static int getNodesNum(LinkNode l){
		int count =0;
		while(l!=null){
			l=l.nextNode;
			count++;
		}
		
		return count;
	}
	public static void insertNode(LinkNode linkNode,int value,LinkNode newLinkNode){
		int count=getNodesNum(linkNode);
		if(count==0){
			LinkNode headNode=new LinkNode(value);
			linkNode=headNode;
			System.out.println("this linkNode has no node ,a head node has been created"+headNode.value);
		}
		else if(count>0){
			newLinkNode.nextNode=linkNode.nextNode;
			linkNode.nextNode=newLinkNode;
			System.out.println("new node has been inserted in,the value is:"+value);
		}
	}
	

	
	
	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
/*		LinkNode ln=new LinkNode(2);
		LinkNode temp=null;
	//	System.out.println(ln.value);
		for(int i=0;i<10;i++){
			insertNode(ln,i);
			///LinkNode singleNode=new LinkNode(12);
			
		}
		insertNode(ln,16);
		System.out.println(new Integer(1).equals(new Long(1)));
*/
		
		Class cls = Class.forName("com.zhj.LinkNode");
		LinkNode  bean=(LinkNode)cls.newInstance();
	    for(Method method:cls.getMethods()){
	      System.out.println(method.getName());
	    }
	}
}
