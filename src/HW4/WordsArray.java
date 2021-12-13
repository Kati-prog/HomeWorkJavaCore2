package HW4;

import java.util.HashMap;
import java.util.Map;

public class WordsArray {
    private String [] arrayWords;

    public WordsArray(String[] arrayWords) {

        this.arrayWords = arrayWords;
    }

    public void doArrayWords() {
        HashMap<String,Integer> mapWords = getMapWords(arrayWords);
        for (Map.Entry entry: mapWords.entrySet()) {
            if (entry.getValue().equals(1)) {
                System.out.println(entry.getKey());
            }
        }
    }

    private HashMap<String, Integer> getMapWords(String[] arrayWords) {
        HashMap<String, Integer> mapWords = new HashMap<>();
        for (String arrayWord : arrayWords) {
            if (mapWords.containsKey(arrayWord)) {
                mapWords.put(arrayWord, mapWords.get(arrayWord) + 1);
            } else {
                mapWords.put(arrayWord, 1);
            }
        }
        return mapWords;
    }
}
