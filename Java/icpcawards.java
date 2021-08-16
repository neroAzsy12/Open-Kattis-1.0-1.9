import java.io.*;
import java.util.*;
public class icpcawards {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());    // num of teams

        // LinkedHashMap, like a HashMap but maintains the order in which the elements are added in
        // teams will keep track of the teams that participated
        LinkedHashMap<String, String> teams = new LinkedHashMap<>();
        
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String school = st.nextToken();
            String team = st.nextToken();

            if(!teams.containsKey(school) && teams.size() < 12) {
                teams.put(school, team);     
            }
        }
        
        // print the 12 unique school/teams
        for(Map.Entry<String, String> s : teams.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}