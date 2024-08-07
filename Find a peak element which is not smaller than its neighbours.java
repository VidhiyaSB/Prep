/*Input: array[]= {5, 10, 20, 15}
Output: 20
Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.

Input: array[] = {10, 20, 15, 2, 23, 90, 67}
Output: 20 or 90
Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20, similarly 90 has neighbors 23 and 67.*/

class HelloWorld {
    public static void main(String[] args) {
        int prev = 0;
        int next = 0;
        int curr = 0;
        int[] arr = {10,20,15,2,23,90,67};
        for(int i=1;i<arr.length-1;i++){
            curr = arr[i];
            prev = arr[i-1];
            next = arr[i+1];
            if((curr>prev) && (curr>next)){
                System.out.println(curr);
            }
            
        }
    }
}
