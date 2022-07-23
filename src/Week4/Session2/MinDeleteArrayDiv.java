package Week4.Session2;
import java.io.*;
import java.util.*;

public class MinDeleteArrayDiv {

    public static int GCD(int n1, int n2)
    {
        if(n2 == 0)
            return n1;
        return GCD(n2, n1%n2);
    }
    public static void main(String args[])throws Exception{
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = {2,3,2,4,3};
        int[] numsDivide = {9,6,9,3,15};
        Arrays.sort(nums);
//        int div = Arrays.stream(numsDivide)
//                .reduce((a,b)->GCD(a,b))
//                .getAsInt();
        int gcd = numsDivide[0];
        for(int i=1; i<numsDivide.length; i++)
        {
            gcd = GCD(gcd, numsDivide[i]);
        }
        for(int i=0; i<nums.length; i++)
        {
            if(gcd % nums[i] == 0) {
                System.out.println("The smallest number is: " + nums[i]);
                break;
            }

        }

    }
}
