package review;

import java.util.Scanner;
import java.util.Stack;

public class validString {

   static boolean isValid(String s){

        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            }
            else if(c == ')' || c == '}' || c == ']'){
                int top = st.peek();
                if(top == '(' && c == ')'){
                    st.pop();
                }
                 if(top == '[' && c == ']'){
                    st.pop();
                }
                 if(top == '{' && c == '}'){
                    st.pop();
                }
            }


          }
          return st.empty();

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(isValid(s));
    }
    
}
