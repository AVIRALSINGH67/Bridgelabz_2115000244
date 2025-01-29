import java.util.*;
public class MostFrequentCharacter {
    public static void main(String[] args) {
        String str = "success";
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char c : str.toCharArray()) freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        char mostFrequent = ' ';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequent = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        System.out.println("Most Frequent Character: " + mostFrequent);
    }
}
