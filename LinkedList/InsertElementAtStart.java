package practiceDsa;

import java.util.Scanner;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

class LinkedList{
	Node head;
	void insert(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
	}
	void insertAtStart(int data) {
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
		
	}
	
	
	void printList() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("null");
	}
}
public class InsertElementAtStart{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		LinkedList ls=new LinkedList();
		
		System.out.println("Number of elements in Linked List");
		int n=sc.nextInt();
		
		ls.insertAtStart(144);
		ls.insertAtStart(56);
		
		
		for(int i=0;i<n;i++) {
			int data=sc.nextInt();
			ls.insert(data);
		}
		
		
		System.out.println("Linked List");
		ls.printList();
		sc.close();
	}
}

