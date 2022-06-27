package Week2.Session2;
import java.io.*;
import java.util.HashMap;
public class majorityElement {
    public static void main(String args[])throws Exception{
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of elements ");
        int n = Integer.parseInt(ob.readLine());
        int[] input = new int[n];
        System.out.println("Enter the input array Elements ");
        for(int i=0; i<n; i++)
            input[i] = Integer.parseInt(ob.readLine());

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++)
        {
            if(!map.containsKey(input[i]))
                map.put(input[i], 1);
            else
                map.put(input[i], map.get(input[i])+1);
        }
        for(int x : map.keySet())
        {
            if(map.get(x) > n/2)
                System.out.println("The majority element is "+ x);
        }
    }
}
