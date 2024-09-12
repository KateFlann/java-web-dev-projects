package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingChars {
    public static void main(String[] args) {
        //String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        Scanner input = new Scanner(System.in);
        System.out.println("Type words please.");
        String quote = input.nextLine();

        HashMap<Character, Integer> charCountMap = new HashMap<>();
        char[] charactersInString = quote.toCharArray();

    for (char character : charactersInString) {
            if (!charCountMap.containsKey(character)) {
                charCountMap.put(character, 1);
            } else {
               charCountMap.put(character, charCountMap.get(character) + 1);
            }

    }
    for(Map.Entry<Character, Integer> entry: charCountMap.entrySet()){
        System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}