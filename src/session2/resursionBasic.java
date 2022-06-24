package session2;
import java.io.*;
public class resursionBasic {
    public static int rec_factorial(int n)
    {
        if(n<=1)
            return 1;
        return n*rec_factorial(n-1);
    }
    public static void main(String args[])throws Exception
    {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number ");
        int n = Integer.parseInt(ob.readLine());
        System.out.println("Factorial of "+ n +" is "+rec_factorial(n));
    }
}
