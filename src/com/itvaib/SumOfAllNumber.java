package com.itvaib;

public class SumOfAllNumber {

    public static int findSum(int num, int n){
        int sum = (n*(n+1))/2;
        return sum;
    }

    public static void main(String ar[]){
        System.out.println(findSum(12345,5));
        String a = "my";
        String b = "my";
        if(a==b) System.out.println("OK");
    }
}
