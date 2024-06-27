class HelloWorld {
    public static void main(String[] args) {
        String s = "Computer";
        char str[] = s.toCharArray();
        String op  ="";
        for(int i=0;i<str.length;i++){
            if(str[i]!='a'&& str[i]!='A'&& str[i]!='e'&&str[i]!='E'&&str[i]!='i'&& str[i]!='I'&& str[i]!='o'&&str[i]!='O'&& str[i]!='u'&& str[i]!='U'){
                              op += str[i];
            }
        }
        System.out.println(op);
}
}
