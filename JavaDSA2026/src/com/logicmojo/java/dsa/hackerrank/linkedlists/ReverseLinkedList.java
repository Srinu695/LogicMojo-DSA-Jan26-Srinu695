package com.logicmojo.java.dsa.hackerrank.linkedlists;

public class ReverseLinkedList {

    public static class Node {
        private int data;
        private  Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

    }


    public static void main(String[] args) {

        Node node1 = new Node(1);
        node1.next = new Node(2);
        node1.next.next = new Node(3);
        node1.next.next.next = new Node(4);
        node1.next.next.next.next = new Node(8);
        node1.next.next.next.next.next = new Node(0);


        System.out.println("========Initial Linked List: Input============");
        printLinkedList(node1);
        System.out.println("\n========Final Linked List: output============");
        Node ans2 = reverseLinkedList(node1);
        printLinkedList(ans2);


    }

    private static Node reverseLinkedList(Node node1) {


        Node current = node1;
        Node prev = null;
        while(current != null){
            Node temp = current.next ;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }

    private static void printLinkedList(Node node) {
        Node temp = node;
        while(temp !=null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }
}
