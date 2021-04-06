package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int [] arry = {1,3,5,6,9};
        int min =findMin(arry);
        System.out.println("So be nhat la : " + min);

    }
    public static int findMin(int arry[]){
        int min = arry[0];
        for(int i =0 ; i < arry.length ; i++){
            if(arry[i] < min){
                min = arry[i];
            }
        }
        return min;
    }
}

