package com.itvaib.linklist.create;

class LinkedList
{
    Node head;  // head of list

    /* Node Class */
    static class Node
    {
        int data;
        Node next;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        // Constructor to create a new node
        Node(int d) {data = d; next = null; }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

}
