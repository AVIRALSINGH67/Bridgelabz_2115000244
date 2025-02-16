public class SearchWordInSentences {
    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {"The quick brown fox", "jumps over the lazy dog", "Hello world"};
        System.out.println(findSentenceWithWord(sentences, "world"));  // Output: Hello world
    }
}