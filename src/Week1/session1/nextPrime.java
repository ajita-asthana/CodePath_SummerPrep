package Week1.session1;
import  java.io.*;
public class nextPrime {
    public static boolean isPrime(int n)
    {
        if(n==0 || n==1)
            return false;

        for(int i=2; i<=Math.sqrt(n); i++)
        {
            if(n%i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static int nextPrime(int n)
    {
        while(!isPrime(n))
            n++;
        return n;
    }
    public static void main(String args[])throws Exception{
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");
        int n = Integer.parseInt(ob.readLine());
        int res = nextPrime(n);
        System.out.println("The result is "+res);
    }
}
