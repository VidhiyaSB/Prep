import java.util.*;
public class Main {
          public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           int arr[] = new int[n];
           int ans[] = new int[n];
           int index=0;
           for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
           }
           for(int i=0;i<arr.length;i++){
               if(arr[i]%2==0){
                ans[index++]= arr[i];
               }
           }
          for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
              ans[index++] = arr[i];
            }
          }
          for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
          }
          }
      }import java.util.*;
public class Main {
          public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           int arr[] = new int[n];
           int ans[] = new int[n];
           int index=0;
           for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
           }
           for(int i=0;i<arr.length;i++){
               if(arr[i]%2==0){
                ans[index++]= arr[i];
               }
           }
          for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
              ans[index++] = arr[i];
            }
          }
          for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
          }
          }
      }
