import java.util.ArrayList;
import java.util.Arrays;

public class ListPractice {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(
            Arrays.asList("syntax", "parser", "token", "lexical")
        );
        
        System.out.println("Enhanced for loop");
        for (String word : words) {
            System.out.println(word);
        }
        
        System.out.println("\nTraditional for loop (UPPERCASE with index)");
        for (int i = 0; i < words.size(); i++) {
            System.out.println("Index " + i + ": " + words.get(i).toUpperCase());
        }
        
        System.out.println("\nWords with more than 5 letters");
        for (String word : words) {
            if (word.length() > 5) {
                System.out.println(word);
            }
        }
    }
}