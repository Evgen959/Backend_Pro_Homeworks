// Дан диапазон чисел: от 1 до 2_000_000 включительно.
// Задача: найти, сколько чисел из этого диапазона
// делятся нацело на 21 и при этом содержат цифру 3.
// Решить данную задачу в один поток.
// Решить данную задачу в два потока, разделив между потоками
// заданный диапазон чисел пополам.
// Сравнить результаты двух решений - они должны совпадать.


package task_02;

public class Task1 {

    static int counter = 0;

    public static void main(String[] args) {

        MyThread myThread = new MyThread();

        myThread.start();

        for (int i = 1; i < 1_000_000; i++) {

            if (((i%21) == 0) && (String.valueOf(i).contains("3"))) {
                incrementCounter();
            }
        }

        try {
            myThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(counter);
    }

    public static synchronized void incrementCounter() {
        counter++;
    }
}
