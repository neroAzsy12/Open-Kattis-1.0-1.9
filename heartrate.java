import java.io.*;
import java.util.StringTokenizer;
public class heartrate {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int cases = Integer.parseInt(br.readLine());
        for(int i = 0; i < cases; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int beats = Integer.parseInt(st.nextToken());
            float seconds = Float.parseFloat(st.nextToken());
            
            float bpm = 60 * beats / seconds;   // calculated bpm
            float abpm = bpm - (60 / seconds);  // min ABPM
            float mbpm = bpm + (60 / seconds);  // max ABPM
            
            System.out.println(abpm + " " + bpm + " " + mbpm);
        } 
    }
}