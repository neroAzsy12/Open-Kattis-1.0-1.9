import java.io.*;
import java.util.StringTokenizer;

public class pet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int position = 1;   // Keeps track of which contestant has the most points
        int points = 0;     // keeps track of the points of the contestant that has the most points

        for (int i = 1; i <= 5; i++) {
            int tmp = 0;    // Keeps track of the ith contestant's points
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            while (st.hasMoreTokens()) {
                tmp += Integer.parseInt(st.nextToken());
            }
            
            if (tmp > points) { // if the points of ith contestant is currently the most,
                position = i;   // update the index of which contestant it is
                points = tmp;   // as well as store the points of that contestant
            }
        }

        System.out.println(position + " " + points);
    }
}
