package com.mycompany.lohera;

import java.util.*;

public class ReverseWords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a phrase:");
        String phrase = scan.nextLine().trim();

        if (phrase.isEmpty()) {
            System.out.println("No phrase was entered.");
            return;
        }

        String[] words = phrase.split("\\s+");
        Stack<String> stack = new Stack<>();

        for (String word : words) {
            stack.push(word);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
            if (!stack.isEmpty()) {
                System.out.print(" ");
            }
        }
        
        System.out.println("");
    }
}
