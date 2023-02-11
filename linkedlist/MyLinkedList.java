package com.bridgelabz.linkedlist;

public class MyLinkedList {
    public Inode head;
    public Inode tail;

    public MyLinkedList() {

        this.head = null;
        this.tail = null;
    }

    public void add(Inode newNode) {

        if (this.tail == null)
            this.tail = newNode;
        if (this.head == null)
            this.head = newNode;
        else {
            Inode tempNode = this.head;
            this.head.setNext(tempNode);
        }
    }

    public void printMyNodes() {

        StringBuffer myNodes = new StringBuffer("My Nodes : ");
        Inode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail))
                myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
}
