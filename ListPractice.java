import java.util.ArrayList;

public class ListPractice extends ArrayList<String>{
    public ListPractice(){
    }
    public void printAll() {
        for (String word : this) {
            System.out.println(word);
        }
    }
    
    public void printAllUpper() {
        for (int i = 0; i < size(); i++) {
            String word = get(i);
            String upper = word.toUpperCase();
            System.out.println("Index " + i + ": " + upper);
        }
    }
    public void printFive() {
        for (String word : this) {
            if (word.length() > 5) {
                System.out.println(word);
            }
        }
    }
    public static void main(String[] args) {
        ListPractice list = new ListPractice();
        list.add("syntax");
        list.add("parser");
        list.add("token");
        list.add("lexical");
        list.printAll();
        list.printAllUpper();
        list.printFive();
    }
}
