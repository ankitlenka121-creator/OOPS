
public class Main5 { 
    public static void main(String[] args) {
        String str = "success";
        int max1 = 0, max2 = 0;
        char first = '\0', second = '\0';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            boolean alreadyCounted = false;

            for (int k = 0; k < i; k++) {
                if (str.charAt(k) == ch) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (!alreadyCounted) {
                if (count > max1) {
                    max2 = max1;
                    second = first;
                    max1 = count;
                    first = ch;
                } else if (count > max2) {
                    max2 = count;
                    second = ch;
                }
            }
        }

        if (max2 == 0) {
            System.out.println("No second most frequent character.");
        } else {
            System.out.println("Second most frequent character: " + second);
            System.out.println("Frequency: " + max2);
        }
    }
}
