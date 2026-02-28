package com.logicmojo.java.dsa.linkedlist;

public class Q5RemoveNthNodeFromEnd {

    public static class Node {
        private int data;
        private Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String args[]) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(8);
        node.next.next.next = new Node(9);
        node.next.next.next.next = new Node(3);
        node.next.next.next.next.next = new Node(4);
        node.next.next.next.next.next.next = new Node(10);
        System.out.println("Linked List");
        printingLinkedList(node);
        Node node2 = node;
        Node ans = removeNthNodeFromEnd(node, 4);
        System.out.println("\nans Linked List after removing node");
        printingLinkedList(ans);

        System.out.println("\nnew Linked List");
        printingLinkedList(node);
        ans = removeNthNodeFromEndUsingDummyNode(node2, 6);
        System.out.println("\nans Linked List after removing node using dummy node");
        printingLinkedList(ans);

    }

    private static Node removeNthNodeFromEndUsingDummyNode(Node node, int position) {
        Node dummy = new Node(0);
        dummy.next = node;
        Node temp = dummy;
        int length = findLengthOfLinkedLists(node);
        for(int i=1;i<= length- position; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return dummy.next;
    }

    private static Node removeNthNodeFromEnd(Node node, int position) {
        Node b = node;
        int length = findLengthOfLinkedLists(node);
        if(length == position){ //If first element needs to be removed, we need to handle this edge case
            return node.next;
        }
        for(int i=1; i< length - position;i++){
            b = b.next;
        }

        b.next = b.next.next;
        return node;

    }

    private static void printingLinkedList(Node node) {
        Node temp = node;
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;

        }
    }

    private static int findLengthOfLinkedLists(Node node) {
        int count=0;
        while(node!=null){
            node = node.next;
            count++;
        }
        return count;
    }
}
