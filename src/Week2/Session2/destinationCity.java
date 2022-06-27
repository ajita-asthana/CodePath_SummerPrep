package Week2.Session2;
import java.io.*;
import java.util.HashSet;
public class destinationCity {
    public static void main(String args[])throws Exception {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));

        String[][] nums = {
                {"B", "C"},
                {"D", "B"},
                {"C", "A"}
        };
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<nums.length; i++)
        {
            set.add(nums[i][0]);
        }
        String result="";
        for(int i=0; i<nums.length; i++)
        {
            if(!set.contains(nums[i][1])) {
                result = nums[i][1];
                break;
            }
        }
        System.out.println(result);
    }
}
