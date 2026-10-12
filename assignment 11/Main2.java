
public class Main2 {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");

        if (s1.length() == s2.length()) {
            int i;

            for (i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    break;
                }
            }

            if (i == s1.length()) {
                System.out.println("Both strings contain the same data.");
            } else {
                System.out.println("Both strings contain different data.");
            }
        } else {
            System.out.println("Both strings contain different data.");
        }
    }
}

