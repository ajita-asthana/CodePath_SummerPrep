package session2;
import java.io.*;
import java.util.HashMap;
public class romanToInt {
    public static void main(String args[])throws Exception{
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Roman String ");
        String str = ob.readLine();
        HashMap<Character, Integer> valMap = new HashMap<>();
        valMap.put('I', 1);
        valMap.put('V', 5);
        valMap.put('X', 10);
        valMap.put('L', 50);
        valMap.put('C', 100);
        valMap.put('D', 500);
        valMap.put('M', 1000);
        int sum = 0;
        int len = str.length();
        for(int i=0; i<len-1; i++)
        {
            int x = valMap.get(str.charAt(i));
            int y = valMap.get(str.charAt(i+1));
            if(x<y)
                sum -= x;
            else
                sum += x;
        }
        sum += valMap.get(str.charAt(len-1));

        System.out.println("The answer is "+ sum);
    }
}
