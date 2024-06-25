class Main {
    public static void main(String[] args) {
        String str = "program";
        char ch[] = str.toCharArray();
        int n = ch.length;
        for(int i=0;i<ch.length;i++){
            for(int j=0;j<ch.length;j++){
                 if((i==j)){
                     System.out.print(ch[i]);
                 }
                 else if(i+j==n-1){
                     System.out.print(ch[n-1-i]);
                 }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}



//Output
/*p     m
 r   a 
  o r  
   g   
  o r  
 r   a 
p     m*/
