package com.guiproject;

import java.util.Scanner;

/**
 *
 * @author Loug
 */
public class Guiproject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Your input: ");
        String mystr = scan.nextLine();
        System.out.println(mystr);
        
        Person loug = new Person("Loug", 32);
        System.out.println(loug);
    }
}
