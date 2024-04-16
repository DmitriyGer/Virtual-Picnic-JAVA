package VirtualPicnic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountingWords {
    public int countWords(String fileName) {

        int coutnWords = 0;
        
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()){
                scanner.next();
                coutnWords++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден, проверте директорию.");
        }
        return coutnWords;
    }
}
