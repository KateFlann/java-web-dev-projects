import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        evenNumbers.add(8);
        evenNumbers.add(10);
        evenNumbers.add(12);
        evenNumbers.add(14);
        evenNumbers.add(16);
        evenNumbers.add(18);
        evenNumbers.add(20);

        int sum = 0;

        for (int i = 0; i < evenNumbers.size(); i++) {
            sum += evenNumbers.get(i);
        }
        System.out.println(sum);


        ArrayList<String> words = new ArrayList<>();
        words.add("Cleopatra");
        words.add("Taiyo");
        words.add("Tsuki");

        String seussQuote = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        ArrayList<String> l = new ArrayList<String>(Arrays.asList(seussQuote.replace(",", "").replace(".", "").split(" ")));
        words.addAll(l);
        System.out.println(words);

        Scanner input = new Scanner(System.in);
        System.out.println("What length word do you want to search for?: ");
        int wordLength = input.nextInt();

        for (String word : words) {
            if (word.length() == wordLength) {
                System.out.println(word);
            }
        }
    }
}
