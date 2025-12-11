import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileOperator {
    private static File myFile;
    private static Scanner fileReader;

    public static void createFile(String filename) {
        try {
            myFile = new File(filename);
            fileReader = new Scanner(myFile);
        } catch (Exception e) {
            System.out.println("Error creating file: " + e.getMessage());
        }

    }


    public static ArrayList<String> readStringData(String filename) {
        ArrayList<String> lines = new ArrayList<>();
        File f = new File(filename);
        try (Scanner sc = new Scanner(f)) {
            while (sc.hasNextLine()) {
                lines.add(sc.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error reading file '" + filename + "': " + e.getMessage());
        }
        return lines;
    }
}