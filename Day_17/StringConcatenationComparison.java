public class StringConcatenationComparison {

    public static void main(String[] args) {
        int operations = 1_000_000;

        long stringTime = concatenateWithString(operations);
        long stringBuilderTime = concatenateWithStringBuilder(operations);
        long stringBufferTime = concatenateWithStringBuffer(operations);

        System.out.println("String Time: " + stringTime + " ms");
        System.out.println("StringBuilder Time: " + stringBuilderTime + " ms");
        System.out.println("StringBuffer Time: " + stringBufferTime + " ms");
    }

    private static long concatenateWithString(int operations) {
        long startTime = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < operations; i++) {
            result += "a";
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long concatenateWithStringBuilder(int operations) {
        long startTime = System.currentTimeMillis();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < operations; i++) {
            result.append("a");
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long concatenateWithStringBuffer(int operations) {
        long startTime = System.currentTimeMillis();
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < operations; i++) {
            result.append("a");
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}