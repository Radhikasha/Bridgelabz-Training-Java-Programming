public class palindrome {
    String text;

     palindrome(){
        this.text = text;

    }
    boolean checkPalindrome(){
        String rev = "";
        for(int j=text.length()-1;j>=0;j--){
            rev += text.charAt(j);
        }
        if(rev.equals(text)){
            return true;
        }
        return false;

    }
    void display(){
        if(checkPalindrome()){
            System.out.println("Text is palindrome");
        }
        else{

        
        System.out.println("text is not palindrome");
        }
    }
    
}
class input{
    public static void main(String[] args) {
        palindrome p = new palindrome();
        p.text = "malayalam";
        p.display();

    }
}
