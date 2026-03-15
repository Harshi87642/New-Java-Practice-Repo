 package com.example.demo.linkedList;

import java.util.ArrayList;
import java.util.scanner;

public class rh77
{
   public static void main(String[] args)
   {
     
      ArrayList<String> cart = new ArrayList<>();
      Scanner sc = new Scanner(System.in);
      int choice;

     do
     {
         System.out.println("\n -----Online Shopping Cart-------");
         System.out.println("1. Add Item");
         System.out.println("2. Dispaly Cart");
         System.out.println("3. Remove Item");
         System.out.println("4. Total Items");
         System.out.print("5. Exit");
         System.out.print("Enter your choice: ");

        choice = sc.nextInt();
        sc.nextLine();

        switch(choice)
         {
            case 1:
                 System.out.print("Enter item name: ");
                  String item = sc.nextLine();
                  cart.add(item);
                  System.out.println(item + "added to cart.");
                  break;

            case 2:
                 System.out.println("Items in Cart: ");
                  for(String s : cart)
                  {
                          System.out.println(i);
                  }
                     break;

            case 3:
                  System.out.print("Enter item to remove: ");
                  String removeItem = sc.nextLine();
                  cart.remove(removeItem);
                  System.out.println(removeItem + "removed from cart.");
                  break;

            case 4:


  