package com.logicmojo.java.dsa.recursion;

public class PrintNumbersUsingRecursion {
    public static void main(String[] args) {
        int num=8;
        System.out.println("========Descending Order=======");
        printInDescendingOrder(num);
        System.out.println();

        System.out.println("========Ascending Order=======");
        printInAscendingOrder(num);
        System.out.println();
    }

    private static void printInAscendingOrder(int num) {
        if(num ==0){
            return;
        }
        printInAscendingOrder(num-1);
        System.out.print(num+ " ");
    }

    private static void printInDescendingOrder(int num) {
        if (num == 0) {
            return;
        }
        System.out.print(num + " ");
        printInDescendingOrder(num-1);
    }
}
