import java.io.*;
import java.util.StringTokenizer;
public class cold {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;

        while(st.hasMoreTokens()) {
            if (Integer.parseInt(st.nextToken()) < 0) {
                count++;
            }
        }
        
        // print the number of temperatures that are strictly less than zero
        System.out.println(count);
    }
}
