public class stack {

        private int size;
        private int  arr[];
        private  int top;

    public stack(int size) {
         this.size = size;
         arr = new int[size];
         top = -1;


    }

    // push
public void push(int data){
    if(! isfull()){
        arr[++top] = data;

    }
    else{
        System.out.println("size is full");
    }
}

// pop
public int   pop(){
    return arr[top--];
}

// peek
public int peek(){
    return arr[top];
}

// isFull
public boolean isfull(){
    if(top == size-1){
        return true;
    }
    return false;
}

//isEmpty
public boolean isEmpty(){
    return top == -1;
}

        

    
    
}

class exe{
    public static void main(String[] args) {
        stack s = new stack(5);
        s.push(5);
        s.push(1);
        s.push(2);
        s.push(3);
       // s.push(4);

        while(! s.isEmpty()){
            int ans = s.pop();
            System.out.println("Elements are: "+ans);

        }

        System.out.println(s.isEmpty());
        System.out.println(s.isfull());

        s.push(34);
        s.push(45);

       System.out.println( s.peek());
    }
}
