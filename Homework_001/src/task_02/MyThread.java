package task_02;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 1_000_001; i < 2_000_000; i++) {
            int x = i/21;
            if (((i%21) == 0) && (String.valueOf(x).contains("3"))) {
                Task1.incrementCounter();
            }
        }
    }
}
