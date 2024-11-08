package Day10;

public class Example_1 {
    public static void main(String[] args) {
          Thread_Example obj=new Thread_Example();
       // Thread_Example obj=new Thread_Example();

        System.out.println(Thread.currentThread().getName());
        obj.start();
    }
}

