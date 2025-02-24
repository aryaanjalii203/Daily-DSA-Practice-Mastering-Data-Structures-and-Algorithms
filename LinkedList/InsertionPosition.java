package practiceDsa;

import java.util.Scanner;

class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList1 {
    Node1 head;

    void insert(int data) {
        Node1 newNode = new Node1(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node1 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void insertAfter(int position, int data) {
        Node1 temp = head;
        int count = 0;
        
        while (temp != null && count < position) {
            temp = temp.next;
            count++;
        }
        
        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        Node1 newNode = new Node1(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void printList() {
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class InsertionPosition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        LinkedList1 ls = new LinkedList1();

        System.out.println("Number of elements in Linked List:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            ls.insert(data);
        }

        System.out.println("Enter the position after which to insert:");
        int position = sc.nextInt();
        System.out.println("Enter the data to insert:");
        int data = sc.nextInt();
        ls.insertAfter(position, data);

        System.out.println("Updated Linked List:");
        ls.printList();
        
        sc.close();
    }
}
