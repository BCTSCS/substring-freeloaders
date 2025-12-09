import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class FileOperator {
    private static File myFile; // The File containing the data
    private static Scanner fileReader;
    
    public static void createFile(String filename){
        try {
            myFile = new File(filename);
            fileReader = new Scanner (myFile);
        } catch (IOException e) {
            System.out.println("File does not exist.");
        }finally {
            System.out.println("Continue");
        }
    }
    
    public static ArrayList<String> getStringData(String filename){
        createFile(filename);
        ArrayList<String> result = new ArrayList<>();
        while (fileReader.hasNextLine()){
            result.add(fileReader.nextLine());
        }
        return result;
    }
}