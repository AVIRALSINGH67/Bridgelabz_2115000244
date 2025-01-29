public class RemoveCharacter {
    public static void main(String[] args) {
        String str = "Hello World";
        char toRemove = 'l';
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != toRemove) sb.append(c);
        }
        System.out.println("Modified String: " + sb.toString());
    }
}
