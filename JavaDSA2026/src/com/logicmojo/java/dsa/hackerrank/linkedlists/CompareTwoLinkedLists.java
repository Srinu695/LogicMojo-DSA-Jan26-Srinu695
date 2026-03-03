package com.logicmojo.java.dsa.hackerrank.linkedlists;

public class CompareTwoLinkedLists {

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

        Node node2 = new Node(1);
        node2.next = new Node(0);
        node2.next.next = new Node(4);
        node2.next.next.next = new Node(3);

        System.out.println(compareLinkedList(node1 , node2));
    }

    private static int compareLinkedList(Node node1, Node node2) {
        Node temp1 = node1;
        Node temp2 = node2;

        while(temp1 !=null && temp2 !=null){
            if(temp1.data != temp2.data){
                return 0;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;

        }
        if(temp1 !=null || temp2 !=null){
            return 0;
        }

        return 1;
    }
}
