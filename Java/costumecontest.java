import java.util.*;
import java.io.*;
public class costumecontest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        TreeMap<String, Integer> costumes = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String costume = br.readLine();

            if (costumes.containsKey(costume)) {
                costumes.put(costume, costumes.get(costume) + 1);
            } else {
                costumes.put(costume, 1);
            }
        }

        int min = 1000;
        for (int val : costumes.values()) {
            if (min > val) {
                min = val;
            }
        }

        for (String costume : costumes.keySet()) {
            if (costumes.get(costume) == min) {
                System.out.println(costume);
            }
        }
    }
}
