
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

class eager{
    private static eager temp = new eager();
    public static  eager getEager(){
        return temp;
    }
}


public class single implements Serializable{

  private static single temp;
    private single() {
      /*   if(temp != null){
            throw new RuntimeException("error");

        }
            */   //yeh reflection api se bchne k liye

    }
// lazy way of creating singleton
    public static single getSingle(){

        if(temp == null){
            temp = new single();
        }
        return temp;

        /*
        synchrnized(single.class){
         if(temp == null){
            temp = new single();
        }
        }
        */



    }

    public static void main(String[] args)  throws Exception{

        // lazy way     dikkt yeh h ki method call hoga jb hi object create hoga
        single a = single.getSingle();
        System.out.println(a.hashCode());

        single b = single.getSingle();
        System.out.println(b.hashCode());


        //eager way  dikkt yeh h ki agr object use nhi krna phir bhi object create hoga
        System.out.println(eager.getEager().hashCode());
        System.out.println(eager.getEager().hashCode());


        //1.  reflection api use to break singleton
       Constructor<single> c = single.class.getDeclaredConstructor();
        c.setAccessible(true); // bcz constr mera private h 
        single s3 = c.newInstance();
        System.out.println(s3.hashCode());
        


        // 2. deserialization
        single ans = single.getSingle();
        System.out.println(ans.hashCode());
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.txt"));
        oos.writeObject(ans);
        System.out.println("SERIALIZATION done");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.txt"));
        single ans2 = (single) ois.readObject();
        System.out.println(ans2.hashCode());

    }

}