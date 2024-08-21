import java.util.*;
class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> m = new HashMap<>();
        int ans = -1;
        for(int i:arr){
          m.put(i,m.getOrDefault(i,0)+1);
        }
       for(int i:arr){
        if(i==m.get(i)){
            ans = Math.max(ans,i);
        }
       }
       return ans;
    }
}
