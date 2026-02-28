package com.logicmojo.java.dsa.linkedlist;

public class Q2MiddleOfLinkedList {

    public static class Node{
        private int  data;
        Node  next;

        Node(int data){
            this.data = data;
            this.next =null;
        }
    }

    public static void main(String[] args) {

        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);
        node.next.next.next.next.next = new Node(6);
        node.next.next.next.next.next.next = new Node(7);

        System.out.println("=============LinkedList==============");
        printingLinkedList(node);

        System.out.println("\n=============Middle Element for Odd==============");
        System.out.println(findMiddleOfLinkedList(node));

        System.out.println("=============LinkedList==============");
        node.next.next.next.next.next.next = null;
        printingLinkedList(node);
        System.out.println("\n=============Second Middle Element for Even Length==============");
        System.out.println(findMiddleOfLinkedList(node)); //Returns second Middle Element

        System.out.println("\n=============First Middle Element for Even Length==============");
        System.out.println(findSecondMiddleOfLinkedList(node));

        System.out.println("\n=============First Middle Element for Even 2 node==============");
        Node twoNode = new Node(1);
        twoNode.next =   new Node(2);
        printingLinkedList(twoNode);
        System.out.println("\n"+ findSecondMiddleOfLinkedList(twoNode));
        System.out.println(findMiddleOfLinkedList(twoNode));

    }

    private static int findSecondMiddleOfLinkedList(Node node) {
        Node fast = node;
        Node slow = node;
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    private static int findMiddleOfLinkedList(Node node) {
        Node slow = node;
        Node fast = node;
        while(fast!= null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    private static void printingLinkedList(Node node) {
        Node temp = node;
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;

        }
    }
}
