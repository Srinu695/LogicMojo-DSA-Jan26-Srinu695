package com.logicmojo.java.dsa.exam;

import java.util.Arrays;

public class Categories {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int categories =0;
        int categorySize = 1;
        int index=0;
        Arrays.sort(arr);
        while(index+ categorySize <= arr.length){
            index += categorySize;
            categorySize++;
            categories++;
        }
        System.out.println(categories);
    }
}
