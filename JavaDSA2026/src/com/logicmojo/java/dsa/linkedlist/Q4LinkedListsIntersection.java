package com.logicmojo.java.dsa.linkedlist;

public class Q4LinkedListsIntersection {

    public static class Node {
        private int data;
        private Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String args[]){
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(8);
        node.next.next.next = new Node(9);
        node.next.next.next.next =  new Node(3);
        node.next.next.next.next.next =new Node(4);
        node.next.next.next.next.next.next =new Node(10);
        System.out.println("First Linked List");
        printingLinkedList(node);


        Node node2 = new Node(6);
        node2.next = node.next.next;
        System.out.println("\nSecond Linked List");
        printingLinkedList(node2);

        Node intersectionNode = findIntersectionOfLinkedLists(node2 , node); // Optimised Method
        System.out.println("\n Intersection Node");
        printingLinkedList(intersectionNode);


        Node intersectionNodeUsingLength = findIntersectionOfLinkedListsUsingLength(node, node2);
        System.out.println("\n Intersection Node using length");
        printingLinkedList(intersectionNodeUsingLength);

    }

    private static Node findIntersectionOfLinkedListsUsingLength(Node node, Node node2) {

        if (node == null || node2 == null)
            return null;

        int length1 = findLengthOfLinkedLists(node);
        int length2 = findLengthOfLinkedLists(node2); // Length Method
        if(length2 > length1) {
            int diff = length2 - length1;
            for (int i = 1; i <= diff; i++) { //Giving headstart for linkedlist with greater length
                node2 = node2.next;
            }
        }
        else{
            int diff = length1 - length2;
            for (int i = 1; i <= diff; i++) { //Giving headstart for linkedlist with greater length
                node = node.next;
            }
        }

        while(node != node2){           //Traversing both linked lists till both nodes are same
            node = node.next;
            node2 = node2.next;
        }
        return node;                    //Returning intersected node
    }

    private static int findLengthOfLinkedLists(Node node) {
        int count=0;
        while(node!=null){
            node = node.next;
            count++;
        }
        return count;
    }

    private static Node findIntersectionOfLinkedLists(Node node, Node node2) {
        if (node == null || node2 == null)
            return null;


        Node a = node;
        Node b = node2;

        while (a != b) {
            a = a.next != null ? a.next : node2;            //Using two pointers traversing both the linked lists
            b = b.next != null ? b.next : node;             //Intersection node , breaking loop and returning the node
        }
        return a;
    }

    private static void printingLinkedList(Node node) {
        Node temp = node;
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;

        }
    }
}
