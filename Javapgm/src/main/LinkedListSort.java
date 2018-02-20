package main;

import java.util.LinkedList;

public class LinkedListSort {
    static Node head;
	static class Node {
    	
		int data;
		Node next;
		public Node(int d){
			data=d;
			next=null;
		}
		public void reverse(Node n){
			
		}
    }
	public LinkedListSort() {
		// TODO Auto-generated constructor stub
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	LinkedListSort list = new LinkedListSort();
		list.head=new Node(85);
		list.head.next=new Node(34);
		list.head.next.next=new Node(24);
		list.head.next.next.next=new Node(14);
		
		//reverse(head);
		
		
	}

}
