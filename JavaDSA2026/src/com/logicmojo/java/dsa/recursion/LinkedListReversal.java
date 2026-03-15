package com.logicmojo.java.dsa.recursion;

public class LinkedListReversal {

    public static class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node node =  new Node(1);
        node.next = new Node(2);
        node.next.next =  new Node(3);
        node.next.next.next =  new Node(4);
        node.next.next.next.next = new Node(5);

        System.out.println("==========Input LinkedList=============");
        printLinkedList(node);
        Node reversed = reverseLinkedList(node);
        System.out.println("==========Reversed LinkedList Iteratively=============");
        printLinkedList(reversed);

        Node reversedRecursive = recursiveReverseLinkedList(reversed);
        System.out.println("==========Reversed LinkedList Recursively=============");
        printLinkedList(reversedRecursive);

    }

    private static Node recursiveReverseLinkedList(Node node) {

        if(node == null || node.next == null){
            return node ;
        }
        Node left= node;
        Node right = recursiveReverseLinkedList(node.next);
        left.next.next = left;
        left.next = null;

        return right;

    }

    static Node reverseLinkedList(Node node) {
        Node prev = null;
        Node current = node;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    static void printLinkedList(Node node){
        while(node !=null){
            System.out.print(node.value + " ");
            node = node.next;
        }
        System.out.println();
    }
}
