package com.logicmojo.java.dsa.hackerrank.linkedlists;

public class DeleteDuplicateNodesFromSortedLinkedLists {

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
        node1.next = new Node(1);
        node1.next.next = new Node(1);
        node1.next.next.next = new Node(1);
        node1.next.next.next.next = new Node(2);
        node1.next.next.next.next.next = new Node(3);
        node1.next.next.next.next.next.next = new Node(3);
        node1.next.next.next.next.next.next.next = new Node(4);
        node1.next.next.next.next.next.next.next.next = new Node(5);
        node1.next.next.next.next.next.next.next.next.next = new Node(5);
        node1.next.next.next.next.next.next.next.next.next.next = new Node(5);
        node1.next.next.next.next.next.next.next.next.next.next.next = new Node(5);

        System.out.println("========Initial Linked List: Input============");
        printLinkedList(node1);
        System.out.println("\n========Final Linked List: output============");
        Node ans2 = deleteDuplicateNodes(node1);
        printLinkedList(ans2);
        System.out.println("\n========Final Linked List: output single pointer============");
        Node ans1 = deleteDuplicateNodesUsingSinglePointer(node1);
        printLinkedList(ans1);

    }

    private static Node deleteDuplicateNodesUsingSinglePointer(Node node1) {
        if (node1 == null || node1.next == null){
            return node1;
        }
        Node temp1 = node1;
        while(temp1.next != null){
            if(temp1.data == temp1.next.data){
                temp1.next =temp1.next.next;
            }
            else {
                temp1 = temp1.next;
            }
        }
        return node1;
    }

    private static void printLinkedList(Node node) {
        Node temp = node;
        while(temp !=null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }

    private static Node deleteDuplicateNodes(Node node1) {

        if (node1 == null || node1.next == null){
            return node1;
            }

        Node temp1 = node1;
        Node temp2 = node1.next;

        while (temp2.next != null) {
            if (temp1.data == temp2.data) {
                temp1.next = temp2.next;
                temp2 = temp2.next;
            }
            else{
                temp1 = temp1.next;
                temp2 = temp2.next;
            }

        }
        if(temp1.data == temp2.data){
            temp1.next = null;
        }

        return node1;
    }
}
