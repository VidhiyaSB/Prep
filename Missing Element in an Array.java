class Solution {
    int missingNumber(int array[], int n) {
        Arrays.sort(array);
        for(int i=1;i<n;i++){
            if(array[i]!=i+1){
                return i+1;
            }
        }
        return n;
    }
}
