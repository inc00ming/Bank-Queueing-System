package com.company;

/**
 * Created by furkan on 15.10.2017.
 */
public class Customer {
    String name;
    int type;
    Customer next;
    Customer prev;

    public Customer(){
        name = null;
        type = 0;
        next = null;
        prev = null;
    }
    public Customer(String name, int type){
        this.name = name;
        this.type = type;
        next = null;
        prev = null;
    }

    public Customer(String name, int type, Customer next, Customer prev) {
        this.name = name;
        this.type = type;
        this.next = next;
        this.prev = prev;
    }

    String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getType(){
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Customer getNext(){
        return next;
    }

    public void setNext(Customer next) {
        this.next = next;
    }

    public void setPrev(Customer prev) {
        this.prev = prev;
    }

    public Customer getPrev() {
        return prev;
    }
}