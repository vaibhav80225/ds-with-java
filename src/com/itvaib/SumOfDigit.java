package com.itvaib;

public class SumOfDigit {
    public static int findSum(int number){
        int sum = 0;
        while(number>0){
            sum += number%10;
            number = number/10;
        }
        return sum;
    }
    public static void main(String ar[]){
        System.out.println(findSum(324));
    }
// When value is in string and cant fit in long
 //    static int getSum(String str)
//    {
//        int sum = 0;
//
//        // Traversing through the string
//        for (int i = 0; i < str.length(); i++) {
//
//            // Since ascii value of
//            // numbers starts from 48
//            // so we subtract it from sum
//            sum = sum + str.charAt(i) - 48;
//        }
//        return sum;
//    }
//
//    // Driver Code
//    public static void main(String[] args)
//    {
//        String st = "123456789123456789123422";
//        System.out.print(getSum(st));
//    }
}
