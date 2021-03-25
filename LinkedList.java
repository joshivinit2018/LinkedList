package com.bridgelabz;

public class LinkedList<K> {
    private LinkedList next;
    private K key;

    public LinkedList(K key){
        this.key=null;
        this.key=null;

    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public LinkedList getNext() {
        return next;
    }

    public void setNext(LinkedList next) {
        this.next = next;
    }


}
