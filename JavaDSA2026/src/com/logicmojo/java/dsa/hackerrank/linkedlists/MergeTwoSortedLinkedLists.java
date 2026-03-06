package com.logicmojo.java.dsa.hackerrank.linkedlists;

public class MergeTwoSortedLinkedLists {
    public static class Node {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

        public static void main(String[] args) {
            Node node1 = new Node(1);
            node1.next = new Node(3);
            node1.next.next = new Node(8);

            Node node2 = new Node(1);
            node2.next = new Node(2);
            node2.next.next = new Node(4);
            node2.next.next.next = new Node(7);

            Node ans = mergeTwoSortedLinkedList(node1, node2);
            printLinkedList(ans);


        }

    private static void printLinkedList(Node node) {
        Node temp = node;
        while(temp !=null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }

        private static Node mergeTwoSortedLinkedList(Node node1, Node node2) {
            Node dummy = new Node(0);
            Node temp = dummy;
            while(node1 != null && node2 !=null){


                if(node1.data <= node2.data){
                    temp.next = node1;
                    node1 = node1.next;

                }
                else{
                    temp.next = node2;
                    node2 = node2.next;
                }
                temp = temp.next;

            }
            temp.next = node1 != null ? node1 : node2;
            return dummy.next;
        }

}
