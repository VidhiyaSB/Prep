import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       String str = "{{}}[][]";
       Stack<Character> s = new Stack<>();
       boolean flag = true;
       for(int i=0;i<str.length();i++){
          char c = str.charAt(i);
          if(c=='{' || c=='[' || c=='('){
              s.push(c);
          }
          else if(c=='}' || c==']' || c==')'){
              if(s.isEmpty()){
                  flag = false;
              }
              char top = s.pop();
              if((top=='{' && c!='}') || (top=='[' && c!=']') ||(top=='(' && c!=')') ){
                  flag = false;
              }
              }
          }
          if(!s.isEmpty())
                     flag = false;
          if(flag){
              System.out.println("valid");
          }
          else{
              System.out.println("invalid");
          }
          
       }
      
    }
