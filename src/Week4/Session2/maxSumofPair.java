package Week4.Session2;
import java.io.*;
import java.util.*;
public class maxSumofPair {
    public static int sumOfElement(int x)
    {
        int res = 0;
        while(x > 0)
        {
            int n = x%10;
            res += n;
            x = x/10;
        }
        return res;
    }
    public static void main(String args[])throws Exception{
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, List<Integer>> map = new HashMap<>();
        int[] nums = {229,398,269,317,420,464,491,218,439,153,482,169,411,93,147,50,347,210,251,366,401};
        for(int i=0; i<nums.length; i++)
        {
            int sumElement = sumOfElement(nums[i]);
            List<Integer> valLst = new ArrayList<>();
            if(!map.containsKey(sumElement))
            {
                valLst.add(nums[i]);
                map.put(sumElement, valLst);
            }
            else
            {
                valLst = map.get(sumElement);
                valLst.add(nums[i]);
                map.put(sumElement, valLst);
            }
        }
        int maxSum = -1;
        for(List<Integer> valLst : map.values())
        {
            Collections.sort(valLst);
            int size = valLst.size();
            if(size>1)
            {
                maxSum = Math.max(maxSum, valLst.get(size-1)+valLst.get(size-2));
            }
        }
        System.out.println("The maximum sum is :"+maxSum);
    }
}
