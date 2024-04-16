package VirtualPicnic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class FrequencyWords {
    public static void calculatingFrequencyWords(String fileName) {

        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        try {
            String content = new String(Files.readAllBytes(Paths.get(fileName)));
            String[] words = content.toLowerCase().split("[^a-zA-Z]+");

            for (String word : words) {
                if (!word.isEmpty()) {
                    wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
                }
            }

            List<Map.Entry<String, Integer>> popularWords = new ArrayList<>(wordFrequencyMap.entrySet());
            popularWords.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

            System.out.println("Частота слов в файле:");
            for (Map.Entry<String, Integer> entry : popularWords) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " раз");
            }

            System.out.println("\nТри самых популярных слова:");
            for (int i = 0; i < Math.min(popularWords.size(), 3); i++) {
                System.out.println(popularWords.get(i).getKey());
            }

        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}