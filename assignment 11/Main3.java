
public class Main3 {
    public static void main(String[] args) {
        String str = "Hello World";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                System.out.println(ch + " : " + i);
            }
        }
    }
}
