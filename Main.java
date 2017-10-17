package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        BankingSystem myBank = new BankingSystem();
        //myBank.printQueue();
        Customer[] array = new Customer[10];
        String[] names = {"furkan", "beste",
                        "aras", "dilara",
                        "cenk", "rukal",
                        "nedim", "nergis",
                        "kasim", "eylul",
                        "murat", "burcu",
                        "kaan", "figen"
                        };
        myBank.printBanner();
        int flag = 1;
        do{
            //myBank.printQueue();
            myBank.printMenu();
            int choice = scan.nextInt();
            int type;
            String name;
            switch (choice){
                case 1 :
                    System.out.print("Please enter the type of customer: ");
                    type = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Name of the customer: ");
                    name = scan.nextLine();
                    myBank.addCustomer(new Customer(name, type));
                    break;
                case 2:
                    myBank.processCustomer();
                    break;
                case 3:
                    flag = 0;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }while (flag != 0);


/*
        Random rand = new Random();
        for(int i = 0; i < 10; i++){
            //array[i] = new Customer(names[rand.nextInt(14)], rand.nextInt(4));
            array[i] = new Customer(names[rand.nextInt(14)], 1);
            System.out.println(array[i].getName() + "-" + array[i].getType());
            myBank.addCustomer(array[i]);
            //System.out.println(myBank.checkConsider(1,array[i], 3));

            myBank.printQueue();
        }
//myBank.printQueue();
        /*
        myBank.processCustomer();
        myBank.printQueue();
        myBank.processCustomer();
        myBank.printQueue();
        myBank.processCustomer();
        myBank.printQueue();
        myBank.processCustomer();
        myBank.printQueue();
        myBank.processCustomer();
        myBank.printQueue();
        myBank.processCustomer();
        myBank.printQueue();
        myBank.processCustomer();
        myBank.printQueue();*/
    }
}
