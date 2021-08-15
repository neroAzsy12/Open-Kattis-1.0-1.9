import java.io.*;
import java.util.StringTokenizer;
public class sorttwonumbers {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());   // first int
        int b = Integer.parseInt(st.nextToken());   // second int

        // print both a and b in increasing order
        System.out.println(a > b ? b + " " + a : a + " " + b);
    }    
}