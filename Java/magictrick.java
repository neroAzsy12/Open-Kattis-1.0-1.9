import java.io.*;
import java.util.*;

public class magictrick {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        HashSet<Character> chars = new HashSet<>();

        for (char c : s.toCharArray()) {
            chars.add(c);
        }

        if (chars.size() == s.length()) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
