package session2;
import java.io.*;

public class powerxOfy {
    public static void main(String args[])throws Exception{
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the power: ");
        //long n = Long.parseLong(ob.readLine());
        int n = Integer.parseInt(ob.readLine());
        System.out.println("Enter the number: ");
        int x = Integer.parseInt(ob.readLine());
        double product = 1.0;
        if(n<0)
        {
            n = -n;
            for(int i=1; i<=n; i++)
                product *= x;
            product = 1/product;
        }
        else{
            for(int i=1; i<=n; i++)
            {
                product *= x;
            }
        }
        System.out.println("The answer is: "+product);
    }
}
