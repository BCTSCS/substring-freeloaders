import java.util.ArrayList;
import java.util.Arrays;

public class ListPractice {
	public static void main(String[] args) {
		// 1. Create an ArrayList<String> with the given words
		ArrayList<String> words = new ArrayList<>(
				Arrays.asList("syntax", "parser", "token", "lexical")
		);

		// 2. Use an enhanced for loop to print each word
		System.out.println("Enhanced for loop (original words):");
		for (String w : words) {
			System.out.println(w);
		}

		// 3. Use a traditional for loop to print each word in UPPERCASE with its index
		System.out.println("\nTraditional for loop (index: UPPERCASE):");
		for (int i = 0; i < words.size(); i++) {
			System.out.println(i + ": " + words.get(i).toUpperCase());
		}

		// 4. Print only words that have more than 5 letters
		System.out.println("\nWords with more than 5 letters:");
		for (String w : words) {
			if (w.length() > 5) {
				System.out.println(w);
			}
		}
	}
}
