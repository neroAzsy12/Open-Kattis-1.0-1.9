import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class nodup {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        HashSet<String> unique = new HashSet<>();
        int counter = 0;

        while (st.hasMoreTokens()) {
            unique.add(st.nextToken());
            counter++;
        }

        if (counter == unique.size()) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
