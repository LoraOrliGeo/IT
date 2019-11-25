package module_three.threads.homework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args) {

        System.out.println("Start");
        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(() -> {
            try {
                Thread.sleep(7000);
                System.out.println("The engine is ready!");
                Thread.sleep(3000);
                System.out.println("A seat is ready!");
                Thread.sleep(2000);
                System.out.println("A tire is ready!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executor.submit(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("The frame is ready!");
                for (int i = 0; i < 2; i++) {
                    Thread.sleep(2000);
                    System.out.println("A tire is ready!");
                }
                Thread.sleep(3000);
                System.out.println("A seat is ready!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executor.submit(() -> {
            try {
                for (int i = 0; i < 3; i++) {
                    Thread.sleep(3000);
                    System.out.println("A seat is ready!");
                }
                Thread.sleep(2000);
                System.out.println("A tire is ready!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        try {
            // 12 seconds is the fastest way to create a car
            executor.awaitTermination(12, TimeUnit.SECONDS);
            executor.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("The car is ready!");
    }
}
