package com.logicmojo.java.dsa.hackerrank.linkedlists;

public class LinkedListProperReverseGroupK {

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



        System.out.println("========Initial Linked List: Input============");
        printLinkedList(node1);
        System.out.println("\n========Final Linked List: output============");
        int k =3;
        Node ans2 =reverseLinkedListGroup(node1, k);
        printLinkedList(ans2);


    }

    private static Node reverseLinkedListGroup(Node head, int k) {


        Node current = head;
        Node next = null;
        Node prev = null;
        int count = 0;
        Node temp = head;
        // This is t verify if input have k nodes to reverse or not.
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }
        // If we dont have k nodes, we are returning head without reversing
        if(count < k){
            return head;
        }
        count=0;
        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }



        // 1--> 2-->3-->4-->5-->6-->7-->8
        //(4-->3-->2-->1).next = rev(5->6->7>8)
        //4 3 2 1 8 7 6 5
        if (next != null) {
            head.next = reverseLinkedListGroup(next, k); // Here we should use head,
            // as once reversed we need to point head next to reversed list
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
