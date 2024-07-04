import java.util.*;
public class Main {
          public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int val = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<arr.length;i++){
              arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int size = arr.length;
            System.out.print(arr[val -1]+" ");
            System.out.print(arr[size - val ]);
          }
      }

