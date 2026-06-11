import java.util.Arrays;
import java.util.List;

class run{
    public static void upper(String str){
        System.out.println(str.toUpperCase());
    }
}



public class staticMethod {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aashu","kavita","prakash","parul");

        // using lambda
        list.forEach(u -> run.upper(u));

        //using static method refernce
        list.forEach(run::upper);

    }
    
}
