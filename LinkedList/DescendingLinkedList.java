package practiceDsa;

import java.util.Scanner;

class Node10{
	int data;
	Node10 next;
	Node10(int data){
		this.data=data;
		this.next=null;
	}
}
class LinkedList10{
	Node10 head;
	void insert(int data) {
		Node10 newNode=new Node10(data);
		if(head==null) {
			head=newNode;
			return;
		}
		Node10 temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=newNode;
	}
	
	void insertion(int pos, int data) {
		if(pos<1) {
			System.out.println("Invalid pos...");
			return;
		}
		if(pos==1) {
			Node10 newNode=new Node10(data);
			newNode.next=head;
			head=newNode;
		}
		int count=1;
		Node10 temp=head;
		while(temp!=null && count<pos-1) {
			temp=temp.next;
			count++;
		}
		if(temp==null) {
			System.out.println("Out of range");
			return;
		}
		
		Node10 newNode=new Node10(data);
		newNode.next=temp.next;
		temp.next=newNode;
	}
	
	void deletion(int pos) {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		if(pos==1) {
			head=head.next;
			return;
		}
		
		int count=1;
		Node10 temp=head;
		while(temp!=null && count<pos-1) {
			temp=temp.next;
			count++;
		}
		while(temp==null || temp.next==null) {
			System.out.println("You have given a position out of the list");
			return;
		}
		
		temp.next=temp.next.next;
	}
	
	void updation(int pos, int newData) {
		if(head==null){
			System.out.println("List is empty cannot update...");
			return;
		}
		int count=1;
		Node10 temp=head;
		if(temp==null) {
			System.out.println("out of range for updation...");
			return;
		}
		while(temp!=null && count<pos) {
			temp=temp.next;
			count++;
		}
		temp.data=newData;
		System.out.println("Element successfull updated");
	}
	

	void desort() {
		if(head==null || head.next==null)return;
		Node10 i,j;
		for(i=head;i.next!=null;i=i.next) {
			for(j=head;j.next!=null;j=j.next) {
				if(j.data<j.next.data) {
					int temp=j.data;
					j.data=j.next.data;
					j.next.data=temp;
				}
			}
		}
	}
	
	void print() {
		Node10 temp=head;
		while(temp!=null) {
			System.out.println(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("null");
	}
}
public class DescendingLinkedList{
	public static void main(String args[]) {
		LinkedList10 ls=new LinkedList10();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element in linked list");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int data=sc.nextInt();
			ls.insert(data);
		}
		System.out.println("Linked List");
		ls.print();
		
		System.out.println("Enter the pos where u want to insert...");
		int pos1=sc.nextInt();
		System.out.println("Enter the value...");
		int data1=sc.nextInt();
		ls.insertion(pos1, data1);
		
		System.out.println("After insertion, this is the linked list");
		ls.print();
		
		System.out.println("Enter the pos which element you want to delete");
		int pos2=sc.nextInt();
		ls.deletion(pos2);
		
		System.out.println("Printing the linked list after deletion");
		ls.print();
		
		System.out.println("which element you want to update?");
		int pos3=sc.nextInt();
		System.out.println("Enter the new value");
		int data2=sc.nextInt();
		ls.updation(pos3, data2);
		
		System.out.println("Linked List after updation...");
		ls.print();
		
		
		System.out.println("desort");
		ls.desort();
		ls.print();
		sc.close();
	}
}
