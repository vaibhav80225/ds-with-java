package com.itvaib.linklist.create.singleLinklist;

/**
 * Singly Linked list example with
 * Insert at begin
 * Insert at end
 * Insert at any location
 * De;ete from Begin
 * Delete from end
 * Delete from Anywhere based on index
 */
public class SLinkedList {
    Node head;
    private  int length;

    SLinkedList(){
        length = 0;
    }

    public int getLength() {
        return length;
    }

    public synchronized Node getHead(){
        return head;
    }

    public synchronized void insertInBegining(Node node){
        node.setNext(head);
        head = node;
        length++;
    }

    public synchronized void insertInEnd(Node node){
        if(head == null){
            node.setNext(head);
            head = node;
            length++;
        }
        else{
            Node current, next;
            current = head;
            for(next = head; next!= null; next=next.getNext()){
                current = next;
            }
            next = node;
            current.setNext(next);
            length ++;
        }
    }

    public synchronized void insertBasedOnIndex(Node node, int position){
        if(head == null){
            node.setNext(head);
            head = node;
            length++;
        }else{
            Node current, next;
            next=head;
            current = next;
            for(int i=0; i<position; i++){
                current = next;
                next = next.getNext();
            }
            node.setNext(next);
            current.setNext(node);
            length++;
        }

    }

    public synchronized void deleteFromBegin(){
        Node node = head.getNext();
        head.setNext(null);
        head = node;
        length--;
    }

    public synchronized void deleteFromEnd(){
        Node current, temp, prev;
        current = head;
        prev = temp = current;
        for(current = head;current != null; current = current.getNext()){
            prev = temp;
            temp = current;
        }
        prev.setNext(null);
        length--;
    }

    public synchronized void deleteBasedOnIndex(int index){
        Node current, temp, prev, next;
        temp = next = current = head;
        for(int i=0; i<index; i++){
            temp = current;
            current = current.getNext();
        }
        next = current.getNext();
        temp.setNext(next);
        length--;
    }

    public static void main(String ar[]){
        SLinkedList linkedList = new SLinkedList();
        for(int i=0; i<5; i++){
            Node node = new Node(i);
            linkedList.insertInBegining(node);
        }
        Node node2 = new Node(10);
        linkedList.insertInEnd(node2);

        Node node3 = new Node(15);
        linkedList.insertBasedOnIndex(node3, 3);
        linkedList.deleteFromBegin();
        linkedList.deleteFromBegin();
        linkedList.deleteFromEnd();
        linkedList.deleteBasedOnIndex(2);
        System.out.println(linkedList.getHead());
        System.out.println(linkedList.getLength());
    }
}
