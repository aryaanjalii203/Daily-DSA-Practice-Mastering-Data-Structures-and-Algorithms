package practiceDsa;

import java.util.Scanner;

class Node2{
	int data;
	Node2 next;
	
	Node2(int data){
		this.data=data;
		this.next=null;
	}
}

class LinkedList2{
	Node2 head;
	void insert(int data) {
		Node2 newNode=new Node2(data);
		if(head==null) {
			head=newNode;
			return;
		}
		Node2 temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
	}
	
	
	void printList() {
		Node2 temp=head;
		while(temp!=null) {
			System.out.println(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("null");
	}
}
public class SimpleLinkedList{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		LinkedList2 ls=new LinkedList2();
		
		System.out.println("Number of elements in Linked List");
		int n=sc.nextInt();
	
		for(int i=0;i<n;i++) {
			int data=sc.nextInt();
			ls.insert(data);
		}
		
		System.out.println("Linked List");
		ls.printList();
		sc.close();
	}
}

