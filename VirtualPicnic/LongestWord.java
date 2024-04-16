package VirtualPicnic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestWord {
    public String SearchLongestWord(String fileName) {

        String longestWord = "";

        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден, проверте директорию.");
        }
        return longestWord;
    }
}
