import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};

      for (int oneInt : integerArray) {
          if (oneInt % 2 == 0) {
                          continue;
          }
          System.out.println(oneInt);
      }

        String seussQuote =  "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] wordsArray = seussQuote.split(" ");
        System.out.println(Arrays.toString(wordsArray));
        String[] sentenceArray = seussQuote.split("\\.");
        System.out.println(Arrays.toString(sentenceArray));


    }
}

//change the delimiter to split the string into separate sentences.


// Use the split method to divide the string at each space and store the individual words in an array.
