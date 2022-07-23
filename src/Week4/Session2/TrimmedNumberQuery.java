package Week4.Session2;

import java.io.*;
import java.util.*;

public class TrimmedNumberQuery {
    public static class Pair implements  Comparable<Pair>{
        String ele;
        int idx;
        Pair(String x, int y)
        {
            this.ele = x;
            this.idx = y;
        }

        @Override
        public int compareTo(Pair otherPair){
            if(this.ele == otherPair.ele)
                return this.idx - otherPair.idx;
            else
                return otherPair.ele.compareTo(this.ele);
        }
    }
    public static String[] trimOperation(String[] arr, int k)
    {
        String[] result = new String[arr.length];
        int i=0;
        for(String s : arr)
        {
            int len = s.length();
            result[i++] = s.substring(len-k, len);
        }
        return result;
    }
    public static Pair findKthSmallest(String[] arr, int k)
    {

        PriorityQueue<Pair> heap = new PriorityQueue<>();
        for(int i=0; i<arr.length; i++)
        {
            heap.add(new Pair(arr[i], i));
            if(heap.size()> k)
                heap.poll();
        }
        return heap.poll();
    }
    public static void main(String[] args)throws Exception{
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = {"102","473","251","814"};
        int[][] queries = {
                {1,1},
                {2,3},
                {4,2},
                {1,2}
        };
        //Trim Operation
        int[] answer = new int[queries.length];

        for(int i = 0; i<queries.length; i++) {
            String[] res = trimOperation(nums, queries[i][1]);
            answer[i] =findKthSmallest(res, queries[i][0]).idx;
        }
        for(int x : answer)
            System.out.print(x+" ");
        
    }
}
