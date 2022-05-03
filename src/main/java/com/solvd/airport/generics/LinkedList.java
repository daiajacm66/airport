package com.solvd.airport.generics;

import java.util.NoSuchElementException;

public class LinkedList<T extends Comparable> {
    private MyNode<T> front;
    private int amount;

    public LinkedList() {
        front = null;
        amount = 0;
    }

    public void add(int index, T x) {
        MyNode<T> node = new MyNode<T>(x, front);
        if (index == 0) {
            front = node;
        } else {
            MyNode<T> p = front;
            // convert to foreach statement
            for (int i = 0; i < index - 1; i++) {
                p = p.getNext();
            }
            node.setNext(p.getNext());
            p.setNext(node);
        }

        amount++;
    }

    public void addFirst(T x) {
        if (x == null) {
            return;
        }

        MyNode<T> p = new MyNode<T>(x, front);
        front = p;

        amount++;
    }

    public void addInOrder(T x) {
        MyNode<T> node = new MyNode<T>(x, null);
        MyNode<T> p = front, q = null;
        while (p != null && x.compareTo(p.getInfo()) >= 0) {
            q = p;
            p = p.getNext();
        }
        node.setNext(p);
        if (q != null) {
            q.setNext(node);
        } else {
            front = node;
        }

        amount++;
    }

    public void clear() {
        this.front = null;
        this.amount = 0;
    }

    public boolean contains(T x) {
        MyNode<T> p = front;
        while (p != null && x.compareTo(p.getInfo()) != 0) {
            p = p.getNext();
        }
        return (p != null);
    }

    public T get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }

        MyNode<T> p = front;
        for (int i = 0; i < index; i++) {
            p = p.getNext();
        }
        return p.getInfo();
    }

    public T getFirst() {
        if (front == null) {
            throw new NoSuchElementException("Error: empty list");
        }
        return front.getInfo();
    }

    public boolean isEmpty() {
        return (front == null);
    }

    public T remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }

        MyNode<T> p = front, q = null;
        for (int i = 0; i < index; i++) {
            q = p;
            p = p.getNext();
        }

        T x = p.getInfo();
        if (q == null) {
            front = p.getNext();
        } else {
            q.setNext(p.getNext());
        }

        amount--;
        return x;
    }

    public T set(int index, T x) {
        if (index < 0 || index >= size()) {
            throw new NoSuchElementException();
        }

        MyNode<T> p = front;
        for (int i = 0; i < index; i++) {
            p = p.getNext();
        }

        T ant = p.getInfo();
        p.setInfo(x);
        return ant;
    }

    public int size() {
        return this.amount;
    }

    public String toString() {
        MyNode<T> p = front;
        String res = "[";
        while (p != null) {
            res = res + p.toString();
            if (p.getNext() != null) {
                res = res + ", ";
            }
            p = p.getNext();
        }
        res = res + "]";
        return res;
    }
}
