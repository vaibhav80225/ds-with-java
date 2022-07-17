package com.itvaib.stack.create;

import java.util.Arrays;

/**
 * Simple Stack example using fixed size array
 */
public class StackFixedSizeArray {
    public static Integer CAPICITY = 10;
    public int[] stacks;
    public static int top = -1;

    StackFixedSizeArray(){
        stacks = new int [CAPICITY];
    }

    Integer size(){
        return top +1;
    }

    public boolean isEmpty(){
        return top<0;
    }

    public int top() throws Exception {
        if(isEmpty()){
            throw new Exception("Staack is Empty");
        }
        return stacks[top];
    }

    public void push(int val) throws Exception {
        if(size().equals(CAPICITY)){
            throw new Exception("stack full");
        }
        stacks[++top] = val;
    }

    public int pop() throws Exception {
        int data;
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        data = stacks[top];
        stacks[top--] = Integer.MIN_VALUE;
        return data;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "data=" + Arrays.toString(stacks) +
                '}';
    }

    public static void main(String ar[]) throws Exception {
        StackFixedSizeArray stackFixedSizeArray = new StackFixedSizeArray();
        for(int i =0; i<10; i++){
            stackFixedSizeArray.push(i);
        }
        System.out.println("Stack After Push" + stackFixedSizeArray);
        // uncomment the below line to see stack overflow exception
//        stackFixedSizeArray.push(100);

        for(int i=0; i<9; i++){
            stackFixedSizeArray.pop();
        }
        System.out.println("Stack After POP" + stackFixedSizeArray);
        stackFixedSizeArray.pop();
        // uncomment below line to see stack underflow exception
//        stackFixedSizeArray.pop();


    }
}
