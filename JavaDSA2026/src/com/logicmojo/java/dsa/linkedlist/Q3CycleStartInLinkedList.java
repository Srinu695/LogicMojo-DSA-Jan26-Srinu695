package com.logicmojo.java.dsa.linkedlist;


public class Q3CycleStartInLinkedList {

    public static class Node{
        private int  data;
        Node next;

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
        node.next.next.next.next.next = node.next;



        System.out.println("=============Meeting Node==============");
        Node meetingNode = findMeetingNode(node);
        System.out.println(meetingNode.data);

        System.out.println("=============Cycle Start Node==============");
        System.out.println(findCycleStart(node, meetingNode));
    }

    private static int findCycleStart(Node node, Node meetingNode) {
        Node start = node;
        while(start!= meetingNode){

            start = start.next;
            meetingNode = meetingNode.next;
        }
        return start.data;
    }

    private static Node findMeetingNode(Node node) {
        Node slow = node;
        Node fast = node;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                return slow;
            }
        }
        return null;
    }


}
