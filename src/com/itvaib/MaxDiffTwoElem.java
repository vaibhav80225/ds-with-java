package com.itvaib;

public class MaxDiffTwoElem {
    public static void main(String []ar){
        int []arr = new int []{80, 2, 6, 3, 100};
//        System.out.println(findDiff(arr));
    }

    public static int findDiff(int []a){
        int min= a[0];
        int max = a[0];
        int interval = 0;
        for(int i=1; i<a.length; i++) {
            if (max < a[i]) {
                max = a[i];
                interval = i;
            }
        }
        for(int j = 1; j<interval; j ++){
            if(min > a[j]){
                min = a[j];
            }
        }
        return max - min;
    }
}
