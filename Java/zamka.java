import java.io.*;
public class zamka {
    
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += (num % 10);
            num /= 10;        
        }
        return sum;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());    // starting range
        int D = Integer.parseInt(br.readLine());    // ending range
        int X = Integer.parseInt(br.readLine());    // target sum

        for (int i = L; i <= D; i++) {
            if (sumOfDigits(i) == X) {
                // print min int whose sum of its digits is X
                System.out.println(i);
                break;
            }
        }

        for (int i = D; i >= L; i--) {
            if (sumOfDigits(i) == X) {
                // print max int whose sum of its digits is X
                System.out.println(i);
                break;
            }
        }
    }
}
