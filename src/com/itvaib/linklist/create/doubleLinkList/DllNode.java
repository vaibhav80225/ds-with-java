package com.itvaib.linklist.create.doubleLinkList;

public class DllNode {
    private DllNode prevNode;
    private DllNode nextNode;
    private int data;

    public DllNode() {
    }

    public DllNode(int data) {
        this.data = data;
    }

    public DllNode getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(DllNode prevNode) {
        this.prevNode = prevNode;
    }

    public DllNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DllNode nextNode) {
        this.nextNode = nextNode;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DllNode{" +
//                "prevNode=" + prevNode.data +
                ", nextNode=" + nextNode +
                ", data=" + data +
                '}';
    }
}
