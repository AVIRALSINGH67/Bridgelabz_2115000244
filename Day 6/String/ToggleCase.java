public class ToggleCase {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) sb.append(Character.toLowerCase(c));
            else sb.append(Character.toUpperCase(c));
        }
        System.out.println("Toggled String: " + sb.toString());
    }
}
