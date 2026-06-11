class compute<T extends Number>{
    T []a;

    public compute(T []a) {
        this.a =a;
    }

   double average(T a[]){
        double sum = 0;
        for(T i : a){
            sum += i.doubleValue();
        }
        return sum/a.length;
        

    }
    
}

public class AverageUpperBound {
    public static void main(String[] args) {
        Integer []a = {2,4,6,3,4};
        compute<Integer> arr = new compute<>(a);
        System.out.println(arr.average(a));


        Double []b = {2.3,4.5,2.5,5.3,24.5};
        compute<Double> arr2 = new compute<>(b);
        System.out.println(arr2.average(b));
    }
    
}
