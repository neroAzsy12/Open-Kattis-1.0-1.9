import java.io.*;

public class chanukah {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cases = Integer.parseInt(br.readLine());    // number of test cases
        
        while (cases-- > 0) {
            String[] tokens = br.readLine().split(" "); 
            int n = Integer.parseInt(tokens[1]);        // n = the num of days to assume for the holiday
            
            // To get the value, the formula (n * (n+1)/2) + n is used
            // Calculate the sum from 1 to n, and then add n to obtain the number of candles needed
            bw.write(tokens[0] + " " + (n * (n + 1) / 2 + n) + "\n");
        }
        bw.close();
        br.close();
    }
}
