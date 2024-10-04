class HelloWorld {
    public static void main(String[] args) {
        int start = 10;
        int end =210;
        int count = 0;
        for(int i=start;i<=end;i++){
            int rev=0;
            int num=i;
            while(num!=0){
                int d = num%10;
                rev = rev*10+d;
                num=num/10;
            }
            if(rev==i){
                count++;
            }
        }
        System.out.print(count);
    }
}
