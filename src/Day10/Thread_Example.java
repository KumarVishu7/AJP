package Day10;

public class Thread_Example extends Thread{
   /* @Override
    public void run() {
        for(int i=1;i<5;i++){
            System.out.println(i);
        }
    }*/

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted.");
        }
    }
}
