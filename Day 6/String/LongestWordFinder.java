public class LongestWordFinder {
    public static void main(String[] args) {
        String sentence = "Java is a programming language";
        String[] words = sentence.split(" ");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) longest = word;
        }
        System.out.println("Longest Word: " + longest);
    }
}
