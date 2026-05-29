import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

@interface myAnno{
    String a() default "radhika";
    int b() default 12;
    String city() default "Mukahrai";
}


@myAnno(a = "AASGY")
class demo{

}

//reflection api
public class custom {
    public static void main(String[] args) {

        demo d = new demo();
        Class c = d.getClass(); 
        System.out.println(c.getName());
        myAnno m = (myAnno) c.getAnnotation(myAnno.class);
        System.out.println(m.a());
        System.out.println(m.b());
        System.out.println(m.city());
        
    }
    
}

