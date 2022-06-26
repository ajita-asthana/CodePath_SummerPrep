package Week1.session2;
import java.io.*;
import java.util.HashSet;

public class happyNum {
    public static void main(String args[])throws Exception
    {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");
        int n = Integer.parseInt(ob.readLine());
        HashSet<Integer> seen = new HashSet<>();
        while(n!=1)
        {
            int current = n;
            int sum = 0;
            while(current != 0)
            {
                int x = current % 10;
                sum += x*x;
                current = current/10;
            }

            if(seen.contains(sum))
            {
                System.out.println("Number is not a happy number!!");
                break;
            }
            seen.add(sum);
            n = sum;
        }
        System.out.println("The number is a Happy Number");
    }
}
