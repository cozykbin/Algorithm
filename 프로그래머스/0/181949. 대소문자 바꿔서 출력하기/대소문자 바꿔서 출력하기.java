import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        char[] line = a.toCharArray();

        for (int i = 0; i < line.length; i++) {
            if (Character.isUpperCase(line[i])) {
                line[i] = Character.toLowerCase(line[i]);
            } else if (Character.isLowerCase(line[i])) {
                line[i] = Character.toUpperCase(line[i]);
            }
        }

        String wow = new String(line);
        System.out.println(wow);

    }
}