package Java;
import java.util.*;
import java.io.*;
public class everywhere {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());    // num of test cases

        for (int i = 0; i < t; i++) {
            HashSet<String> cities = new HashSet<>();   // contains the num of unique cities visited in a trip

            int locations = Integer.parseInt(br.readLine()); // num of locations visited
            while(locations > 0) {
                cities.add(br.readLine());
                locations--;
            }

            System.out.println(cities.size());  // print the num of unique locations that were visited
        }
    }
}
