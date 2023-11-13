package org.example.LinkedList.day1;

public class MiddleLinkedList {

    public static void main(String[] args){
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        Node node5 = new Node(50);
        Node node6 = new Node(60);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        Node head = node1;
        Node result = middleLinkedList(head);
        System.out.println("Middle of the linked list is :"+result.value);
    }

    public static Node middleLinkedList(Node head){
        System.out.println("data received :"+head.value);
        Node slow = head;
        Node fast = head;
        while ( fast.next != null && fast != null){
            slow = slow.next;
            fast = fast.next.next;
            System.out.println(slow.value);
        }
        return slow;
    }
}
