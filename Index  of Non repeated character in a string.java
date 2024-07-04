import java.util.*;
public class Main {
          public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String str = sc.next();
          char ch[] = str.toCharArray();
          int[] count = new int[256];
          for(char i:ch){
            count[i]++;
          }

          for(int i=0;i<ch.length;i++){
            char c = ch[i];
            if(count[c]==1){
                System.out.print(i+1 + " ");
            }
          }
          }
}
