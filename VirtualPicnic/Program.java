package VirtualPicnic;

/**
 * 1. Осуществить подсчет слов: Напишите программу, которая подсчитывает количество
 * слов в файле input.txt.
 * 
 * 2. Найти самое длинное слово: Создайте программу, которая находит самое длинное
 * слово в файле.
 * 
 * 3. Вычислить частоту слов: Напишите программу, которая анализирует, сколько раз
 * каждое слово встречается в файле. Подумайте об этом как о подсчете того,
 * какие фрукты и овощи самые популярные на вашем пикнике!
 */
public class Program {
    public static void main(String[] args) {
        
        CountingWords countingWords = new CountingWords();
        LongestWord longestWord = new LongestWord();
        FrequencyWords frequencyWords = new FrequencyWords();
        String fileName = "input.txt";

        int count = countingWords.countWords(fileName);
        System.out.println("Количество слов в файлу: " + count);

        System.out.println();

        String longest = longestWord.SearchLongestWord(fileName);
        System.out.println("Самое длинное слово в файле: " + longest);

        System.out.println();

        frequencyWords.calculatingFrequencyWords(fileName);

    }
}
