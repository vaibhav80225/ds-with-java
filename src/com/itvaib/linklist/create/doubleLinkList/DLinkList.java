package com.itvaib.linklist.create.doubleLinkList;


public class DLinkList {
    public DllNode head;
    int count =0;

    public void insertNodeBegin(DllNode node){
        if(head != null) {
            head.setPrevNode(node);
        }
            node.setNextNode(head);
            node.setPrevNode(null);
            head = node;
            count++;
        }

    public void insertNodeInEnd(DllNode node){
        DllNode  current, nextNode;
        current = head;
        if(head == null){
            head = node;
            count++;
        }else{
        for(nextNode = head; nextNode!= null; nextNode = nextNode.getNextNode() ){
            current = nextNode;

        }
        current.setNextNode(node);
        node.setPrevNode(current);
        count++;
    }}

    public void inserIntoIndex(int index, DllNode node){

    }

    public void deleteFromBegin(){

    }

    public void deleteFromEnd(){

    }

    public void deleteByIndex(){

    }



    public static void main(String ar[]){
        DLinkList dLinkList = new DLinkList();
        for(int i=0; i<5; i++){
            DllNode node = new DllNode(i);
            dLinkList.insertNodeBegin(node);

        }
        System.out.println(dLinkList.head);
        DllNode node = new DllNode(6);
        dLinkList.insertNodeInEnd(node);
        System.out.println(dLinkList.head);
    }
}
