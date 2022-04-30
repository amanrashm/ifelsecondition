package com.MYCODES;

import java.util.Scanner;

 public class Ifelse {

     public static void main(String[] args) {
         // write your code here
         Scanner x = new Scanner(System.in);
         System.out.println("Enter Your Day ");
//         String Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
         int a = x.nextInt();
//         int a = 1;
// implementing if else condition....

         if (a == 2) {
             System.out.println("Today is Tuesday");
         } else if (a == 1) {
             System.out.println("Today is Monday");
         } else
             System.out.println("Today is Wednesday");


         }
     }





