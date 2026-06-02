class eager{
    private static eager temp = new eager();
    public static  eager getEager(){
        return temp;
    }
}


class single{

  private static single temp;
    private single(){

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

    public static void main(String[] args) {

        // lazy way     dikkt yeh h ki method call hoga jb hi object create hoga
        single a = single.getSingle();
        System.out.println(a.hashCode());

        single b = single.getSingle();
        System.out.println(b.hashCode());


        //eager way  dikkt yeh h ki agr object use nhi krna phir bhi object create hoga
        System.out.println(eager.getEager().hashCode());
        System.out.println(eager.getEager().hashCode());
    }

}