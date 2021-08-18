import java.io.*;
import java.util.*;
public class datum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int D = Integer.parseInt(st.nextToken());   // day D
        int M = Integer.parseInt(st.nextToken());   // month M

        ArrayList<String> days = new ArrayList<>();
        days.add("Monday");     // 0
        days.add("Tuesday");    // 1
        days.add("Wednesday");  // 2
        days.add("Thursday");   // 3
        days.add("Friday");     // 4
        days.add("Saturday");   // 5
        days.add("Sunday");     // 6

        HashMap<Integer, Integer> monthFirstDay = new HashMap<>();
        monthFirstDay.put(1, 3);    // Thursday is the first day of January
        monthFirstDay.put(2, 6);    // Sunday is the first day of February
        monthFirstDay.put(3, 6);    // Sunday is the first day of March
        monthFirstDay.put(4, 2);    // Wednesday is the first day of April
        monthFirstDay.put(5, 4);    // Friday is the first day of May
        monthFirstDay.put(6, 0);    // Monday is the first day of June
        monthFirstDay.put(7, 2);    // Wednesday is the first day of July
        monthFirstDay.put(8, 5);    // Saturday is the first day of August
        monthFirstDay.put(9, 1);    // Tuesday is the first day of September
        monthFirstDay.put(10, 3);   // Thursday is the first day of October
        monthFirstDay.put(11, 6);   // Sunday is the first day of November
        monthFirstDay.put(12, 1);   // Tuesday is the first day of December

        // print the day of week for M/D/2009
        System.out.println(days.get(((monthFirstDay.get(M) - 1) + D) % 7));
    }
}
