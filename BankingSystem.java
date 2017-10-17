package com.company;

/**
 * Created by furkan on 15.10.2017.
 */
public class BankingSystem {
    private Linked_List queue;
    private int[][] limits = new int[][] {{5}, {3}, {2}, {1}};
    public BankingSystem(){
        queue = new Linked_List();
    }
    public void addCustomer(Customer c){
        Customer temp = queue.getTail();
        if(temp == null){
            queue.addTail(c);
            return;
        }
        while( (temp.getPrev() != null) && (temp.getType() > c.getType()) ){
            temp = temp.getPrev();
        }
        if(temp.getPrev() == null ){ //head
            if(temp.getType() > c.getType()) {
                queue.addHead(c);
                return;
            }
            else{
                queue.addAfterCustomer(temp,c);
                return;
            }
        }
        else {
            if(temp.getType() < c.getType()) {
                queue.addAfterCustomer(temp, c);
                return;
            }
            else{
                if(checkConsider(c.getType(), temp, limits[c.getType()][0])){
                    queue.addAfterCustomer(temp, c);
                }
                else
                    queue.addTail(c);
            }
        }
    }
    public boolean checkConsider(int type, Customer c, int rowLimit){
        Customer temp = c;
        for(int i = 0; i < rowLimit; i++){
            if (temp == null)
                return true;
            else if(temp.getType() != type){
                return true;
            }
            else
                temp = temp.getPrev();
        }
        return false;
    }

    public void processCustomer(){
        if(queue.isEmpty()) {
            System.out.println("There is no customer in the queue");
            return;
        }
        Customer processed = queue.removeHead();
        System.out.println(processed.getName() + " is processed-" + processed.getType());
    }

    public void printQueue(){
        System.out.print("Current Queue: ");
        queue.printQueue();
    }

    public void printBanner(){
        System.out.println("------ Bank System --------");
    }

    public void printMenu(){
        printQueue();
        System.out.println("1- Add a new customer to the queue\n2- Process a customer\n3- Exit");
    }
}

