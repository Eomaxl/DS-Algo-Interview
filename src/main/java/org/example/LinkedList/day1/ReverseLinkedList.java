package org.example.LinkedList.day1;
/*
 *    Input Format
 *    head = [3,6,8,10]
 *
 *   Output Format
 *   head = [10,8,6,3]
 *
 *
 * */
public class ReverseLinkedList {
    public static void main(String[] args){
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        Node head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        System.out.println("Before reversal : ");
        printLinkedList(head);
        System.out.println("After Reversal :");
        Node newhead = reverseLinkedList(head);
        printLinkedList(newhead);
    }

    public static void printLinkedList(Node head){
        while(head != null){
            System.out.print(head.value+" --> ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node reverseLinkedList(Node head){
        Node prev = null;
        Node curr = head;
        while (curr != null){
            Node nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public static Node recursiveReverse(Node head){
        return recursiveReversal(head,null);
    }

    public static Node recursiveReversal(Node head, Node newNode){
        if(head == null){
            return head;
        }
        Node next = head.next;
        head.next = newNode;
        return recursiveReversal(next,head);
    }
}

class Node{
    int value;
    Node next;

    public Node(int value){
        this.value = value;
        this.next = null;
    }
}

