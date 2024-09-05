package org.launchcode;
import java.util.Scanner;


public class Alice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Alice in Wonderland Search Term:");

        String searchTerm = input.nextLine();
        String Alice = ("Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’");
        System.out.println(Alice.toUpperCase().contains(searchTerm.toUpperCase()));
        System.out.println(searchTerm.length());
        System.out.println(Alice.indexOf(searchTerm));



//        Assume the user enters a word that is in the sentence.
//        Print out its index within the string and its length.
//        Next, remove the word from the string and print the sentence again to confirm your code.
//        Remember that strings are immutable, so you will need to reassign the old sentence
//        variable or create a new one to store the updated phrase.
    }

}
