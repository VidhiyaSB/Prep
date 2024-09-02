
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int n1 = 2;
        int[] arr1 = new int[n];
        int[] arr2  = new int[n1];
        List<Integer> l = new ArrayList<>();
        int ii = 0;
        int j=0;
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
         for(int i=0;i<n1;i++){
            arr2[i] = sc.nextInt();
        }
        while(ii<n && j<n1){
            if(arr1[ii]<arr2[j]){
                l.add(arr1[ii]);
                ii++;
            }
            else{
                l.add(arr2[j]);
                j++;
            }
        }
        while(ii<n){
            l.add(arr1[ii]);
            ii++;
        }
        while(j<n1){
            l.add(arr2[j]);
            j++;
        }
        for(int i:l){
            System.out.print(i);
        }
        
    }
}
