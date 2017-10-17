package com.company;

/**
 * Created by furkan on 15.10.2017.
 */
public class Linked_List {
    protected Customer head;
    protected Customer tail;
    public int size;

    public Linked_List(){
        head = null;
        tail = null;
        size = 0;
    }

    public Customer getHead(){
        return head;
    }

    public Customer getTail() {
        return tail;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addQueue(Customer c){
        if(head == null){
            addTail(c);
            return;
        }
    }

    public void addAfterCustomer(Customer prev, Customer c){
        if(prev == null){
            System.out.println("Previous customer is null, error!");
            return;
        }

        c.setNext(prev.getNext());
        prev.setNext(c);
        c.setPrev(prev);
        if(c.getNext() != null){
            c.getNext().setPrev(c);
        }
        if(prev == getTail())
            tail =c;
        size++;
    }

    public void addTail(Customer c){
        c.setNext(null);
        if(head == null){
            c.setPrev(null);
            head = c;
            tail = c;
            size++;
            return;
        }
        else{
            tail.setNext(c);
            c.setPrev(tail);
            tail = c;
        }
        size++;
    }

    public void addHead(Customer c){
        head.setPrev(c);
        c.setNext(head);
        c.setPrev(null);
        head = c;
        size++;
    }

    public Customer removeHead(){
        Customer processed = head;
        head = head.getNext();
        head.setPrev(null);
        size--;
        return processed;
    }

    public void printQueue(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        Customer temp = head;
        while (temp != null){
            if(temp.getNext() == null)
                System.out.println(temp.getName()+temp.getType());
            else
                System.out.print(temp.getName()+temp.getType()+"-");
            temp = temp.getNext();
        }
    }
}