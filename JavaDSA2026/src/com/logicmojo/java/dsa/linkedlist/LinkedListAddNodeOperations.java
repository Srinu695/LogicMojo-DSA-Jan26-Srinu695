package com.logicmojo.java.dsa.linkedlist;

public class LinkedListAddNodeOperations {

    public static class Node{
        private int data;
        private Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next= new Node(3);
        node.next.next.next =  new Node(4);

        System.out.println("======LinkedList=======");
        printLinkedList(node);

        System.out.println("\n======LinkedList Insertion at beginning=======");
        Node insertAtBegin = new Node(0);
        Node inserted = insertAtBeginning(insertAtBegin, node);
        printLinkedList(inserted);

        System.out.println("\n======LinkedList Insertion at position=======");
        Node insertNode = new Node(8);
        Node finalLinkedList = insertAtPosition(insertNode, inserted, 3); //Position starts from 1
        printLinkedList(finalLinkedList);


        System.out.println("\n======LinkedList Insertion at end=======");
        Node lastNode = new Node(5);
        Node ans = insertAtEnd(lastNode, finalLinkedList);
        printLinkedList(ans);

        System.out.println("\n========= Delete at beginning================");
        Node nodeDeleted = deleteAtBeginning(ans);
        printLinkedList(nodeDeleted);

        System.out.println("\n========= Delete at position================");
        Node deletedAtPosition = deleteAtPosition(nodeDeleted,3); //Position starts from 1
        printLinkedList(deletedAtPosition);

        System.out.println("\n========= Delete at end================");
        Node deletedAtEnd = deleteLastNode(deletedAtPosition);
        printLinkedList(deletedAtEnd);


    }

    private static Node deleteLastNode(Node node) {
        Node temp = node;
        while(temp.next.next !=null){
            temp = temp.next;
        }
        temp.next = null;
        return node;
    }

    private static Node deleteAtPosition(Node nodeDeleted, int position) {
        Node temp = nodeDeleted;
        for(int i=1;i<position-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return nodeDeleted;
    }

    private static Node deleteAtBeginning(Node node) {
        Node temp = node;
        temp = temp.next;
        return temp;
    }

    private static Node insertAtEnd(Node lastNode, Node finalLinkedList) {
        Node temp = finalLinkedList;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = lastNode;
        return finalLinkedList;
    }

    private static Node insertAtPosition(Node insertNode, Node node, int position) {
        Node temp = node;
        for(int i=1;i<position-1;i++){
            temp = temp.next;
        }
        insertNode.next = temp.next;
        temp.next = insertNode;
        return node;
    }

    private static Node insertAtBeginning(Node insertAtBegin, Node node) {
        insertAtBegin.next = node;
        return insertAtBegin;

    }

    private static void printLinkedList(Node node) {
        Node temp = node;
        while(temp !=null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }
}
