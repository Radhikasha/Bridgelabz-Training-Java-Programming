class run<T extends Number>{
    T a;

    run(T a){
        this.a = a;
    }
    public T get(){
        return a;
    }
}

public class upperBound {
    public static void main(String[] args) {
        run<Integer> a = new run<Integer>(34);
        System.out.println(a.get());

        run<Double> b = new run<Double>(2.7);
        System.out.println(b.get());
    }
}

