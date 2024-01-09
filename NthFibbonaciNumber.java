import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	if(n==1 || n==2){
		System.out.println("1");
	}
	else{
	int prev = 1;
	int curr = 1;
	for(int i=3;i<=n;i++){
         int next = prev + curr;
		 prev = curr;
		 curr = next;
	}
	System.out.println(curr);
	}
		
	}

}
