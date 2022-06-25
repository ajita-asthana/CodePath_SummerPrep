package session2;
import java.io.*;

public class fibonacciSeq {
    public static int fib(int n)
    {
        if(n<=2)
            return n;

        return fib(n-1)+fib(n-2);
    }
    public static void main(String args[])throws Exception{
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the nth Fibonacci Number: ");
        int n = Integer.parseInt(ob.readLine());
        /**int[] arr = new int[n+2];
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2; i<=n; i++)
        {
            arr[i] = arr[i-1] + arr[i-2];
        }
        for(int x : arr)
            System.out.print(x+" ");


        int first = 1;
        int second = 2;
        for(int i=0; i<n; i++)
        {
            int num = first+second;
            first = second;
            second = num;
        }
        System.out.println(first); */
        for(int i=1; i<=n; i++)
            System.out.print(fib(i)+" ");
    }
}
