import java.io.*;

public class planina {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // n = num of iterations
        // n = 2^n + 1, the formula for obtaining num of points in a row
        int n = (int)Math.pow(2, Integer.parseInt(br.readLine())) + 1;

        // the num of points is n^2
        System.out.println((int)Math.pow(n, 2));
    }
}
