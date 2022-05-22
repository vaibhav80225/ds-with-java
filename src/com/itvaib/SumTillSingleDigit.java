package com.itvaib;

public class SumTillSingleDigit {
    public static int findSum(int digit){
        int sum = 0;
        int totalsum =0;
        while(sum>0 || digit>0){
            if(digit == 0){
                digit = sum;
                sum = 0;
            }
            sum += digit%10;
            digit = digit/10;
        }
        while(sum>0){
            totalsum += sum%10;
            sum = sum/10;
        }
        return totalsum;
    }
    public static void main(String ar[]){
        System.out.println(findSum(5674));
    }
}
