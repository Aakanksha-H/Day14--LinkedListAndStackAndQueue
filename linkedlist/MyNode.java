package com.bridgelabz.linkedlist;

public class MyNode<K> implements Inode<K> {

    private Inode next;
    private K key;

    MyNode(int key) {

        this.key = null;
        this.next = null;
    }

    public K getKey() {

        return key;
    }

    @Override
    public void setKey(K key) {

        this.key = key;
    }

    public Inode getNext() {

        return next;
    }

    public void setNext(Inode next) {

        this.next = next;
    }
}
