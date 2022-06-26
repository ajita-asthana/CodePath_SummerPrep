package Week1.session2;
import java.io.*;

public class multiples3_5 {
    public static void main(String args[])throws Exception{
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        int sum =0;
        for(int i=3; i<1000; i++)
        {
            if(i%3 == 0 || i%5==0)
                sum += i;
        }
        System.out.println("Sum is: "+ sum);
    }
}
