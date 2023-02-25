import java.util.*;
public class TextManipulation {
    private static List<String> splitToSentences(String text) {
        if(!text.contains(".") || !text.contains(" "))throw new IllegalArgumentException("The string must contain at least one sentence(with dot by the end)");
        int index = -1;
        LinkedList<String> sentences = new LinkedList<>();
        // traversing the text to find dots, and if found splitting the tex
        for (int i = 0; i < text.length(); ++i) {
            if (text.charAt(i) == '.' && i != text.length()-1) {
                sentences.add(text.substring(index+1, i+2));
                index = i+1;
            }
            if (i == text.length()-1) {
                sentences.add(text.substring(index+1));
            }
        }
        return sentences;
    }
    private static List<String> splitToWords(String sentence){
        int index = 0;
        LinkedList<String> words = new LinkedList<>();
        // traversing the sentence to find whitespace, and if found splitting the sentence
        for (int i = 0; i < sentence.length(); ++i) {
            if (i == sentence.length()-1){
                words.add(sentence.substring(index));
            }
            if (sentence.charAt(i) == ' ' && i != sentence.length()-1) {
                words.add(sentence.substring(index, i+1));
                index = i+1;
            }
        }
        return words;
    }
    private static StringBuilder listToString(LinkedList<String> words){
        StringBuilder string = new StringBuilder();
        // traversing list of words, and adding them to string
        for (String word : words) {
            string.append(word);
        }
        return string;
    }
    public static StringBuilder swapFirstLastWord(String text){
        if (text.equals(""))throw new IllegalArgumentException("The string can't be empty.");
        // splitting text to sentences
        List<String> sentences = splitToSentences(text);
        StringBuilder finalText = new StringBuilder();
        // splitting sentences to words and swapping them
        for (String s : sentences) {
            LinkedList<String> words = (LinkedList<String>) splitToWords(s);
            Collections.swap(words, words.indexOf(words.getFirst()), words.indexOf(words.getLast()));
            finalText.append(listToString(words));
        }
        return finalText;
    }
}
