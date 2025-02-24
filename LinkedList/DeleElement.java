package practiceDsa;

import java.util.Scanner;

class Node6 {
    int data;
    Node6 next;

    Node6(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList6 {
    Node6 head;

    void insert(int data) {
        Node6 newNode = new Node6(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node6 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void Insertion(int pos, int data) {
        if (pos < 1) {
            System.out.println("You have given a wrong position");
            return;
        }
        if (pos == 1) {
            Node6 newNode = new Node6(data);
            newNode.next = head;
            head = newNode;
            return;
        }
        Node6 temp = head;
        int count = 1;
        while (temp != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Out of Range");
            return;
        }
        Node6 newnode = new Node6(data);
        newnode.next = temp.next;
        temp.next = newnode;
    }

    void deletePosition(int pos) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (pos == 1) {
            head = head.next;
            return;
        }
        Node6 temp = head;
        int count = 1;

        while (temp != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Position out of the range, Cannot delete...");
            return;
        }
        temp.next = temp.next.next;
    }

    void printList() {
        Node6 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class DeleElement {
    public static void main(String[] args) {
        LinkedList6 ls = new LinkedList6();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to add in linked list:");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            ls.insert(data);
        }

        System.out.println("Linked List after insertion:");
        ls.printList();

        System.out.println("Enter the position where you want to insert an element in the linked list:");
        int pos = sc.nextInt();
        System.out.println("Enter the element you want to insert:");
        int data = sc.nextInt();
        ls.Insertion(pos, data);

        System.out.println("Linked List after inserting at position " + pos + ":");
        ls.printList();

        System.out.println("Enter the position of the element you want to delete:");
        int delPos = sc.nextInt();
        ls.deletePosition(delPos);

        System.out.println("Linked List after deletion at position " + delPos + ":");
        ls.printList();

        sc.close();
    }
}
