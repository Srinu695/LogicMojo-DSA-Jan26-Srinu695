package com.logicmojo.java.dsa.linkedlist;

public class Q1LinkedListCycle {
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
        node.next =  new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        //node.next.next.next.next = node;
        node.next.next.next.next = node.next;

        System.out.println(findIfCycleExistsInLinkedList(node));

    }

    private static boolean findIfCycleExistsInLinkedList(Node node) {
        Node slow = node;
        Node fast = node;
        while(fast !=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                return true;
            }

        }
        return false;
    }
}
