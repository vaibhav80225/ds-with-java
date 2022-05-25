package com.itvaib.linklist.create.basicdemo;


public class NodeOperation {
    public static void main(String ar[]){
        LinkedList linkedList = new LinkedList();
        linkedList.head = new LinkedList.Node(0);
        for(int i=1; i<10; i++){
            insertIntoLinkedList(linkedList.head, i);
        }
        System.out.println(linkedList.head);
        insertIntoLinkedList(linkedList.head, 10);
        System.out.println(linkedList.head);
        insertNodeAtBegining(linkedList.head, -12);
        System.out.println(linkedList.head);
    }

    static void insertIntoLinkedList(LinkedList.Node head, int i){
        LinkedList.Node start = head;
        LinkedList.Node current = start.getNext();
        while(start != null){
            current = start;
            start = current.getNext();

        }
        start = new LinkedList.Node(i);
        current.setNext(start);
    }

    static void insertNodeAtBegining(LinkedList.Node head, int i){
        LinkedList.Node start = head;
        LinkedList.Node temp = new LinkedList.Node(i);
        temp.setNext(start);
        start =  temp;

    }

    static void insertNodeInBeginning(){

    }

//    static void insertNodeInEnd(LinkedList.Node head, int i){
//        LinkedList.Node start = head;
//        while(start != null){
//
//        }
//    }

}


