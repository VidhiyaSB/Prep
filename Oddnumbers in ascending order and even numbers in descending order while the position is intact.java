// Your current selection is Java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int evenindex = 0;
        int oddindex=0;
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i : arr){
            if(i%2==0){
                even.add(i);
            }
            else{
                odd.add(i);
            }
        }
        Collections.sort(odd);
        Collections.sort(even, Collections.reverseOrder());
       for(int i=0;i<arr.length;i++){
           if(arr[i]%2==0){
               arr[i] = even.get(evenindex++);
           }
           else{
               arr[i] = odd.get(oddindex++);           
       }
       }
       System.out.print("Sorted array: ");
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] +" ");
        }
}
}
       
