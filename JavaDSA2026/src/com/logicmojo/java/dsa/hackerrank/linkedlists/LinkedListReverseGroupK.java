package com.logicmojo.java.dsa.hackerrank.linkedlists;

public class LinkedListReverseGroupK {

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
        node1.next.next.next.next.next = new Node(9);
        node1.next.next.next.next.next.next = new Node(10);
        node1.next.next.next.next.next.next.next = new Node(11);


        System.out.println("========Initial Linked List: Input============");
        printLinkedList(node1);
        System.out.println("\n========Final Linked List: output============");
        int k =4;
        Node ans2 =reverseLinkedListGroup(node1, k);
        printLinkedList(ans2);


    }

    private static Node reverseLinkedListGroup(Node node1, int k) {


        Node current = node1;
        Node next = null;
        Node prev = null;
        int count = 0;
        while(current != null && count <k){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
              }

        if(next != null){
        node1.next = reverseLinkedListGroup(next, k);
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
