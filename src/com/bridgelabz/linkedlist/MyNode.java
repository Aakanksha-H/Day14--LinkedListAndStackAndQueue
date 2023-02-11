package com.bridgelabz.linkedlist;

public class MyNode<K> {

    private MyNode next;
    private K key;

    MyNode(int key) {

        this.key = null;
        this.next = null;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }
}
