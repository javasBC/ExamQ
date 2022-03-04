package Q3;

import java.util.Scanner;

public class ThreadMain {

    public static void main(String[] args) throws InterruptedException {
        Status s = new Status();
        Thread thread = new Thread(new ThreadManger(s));
        thread.start();
        Scanner sc1= new Scanner(System.in);
        sc1.next();
        thread.interrupt();
        System.out.println(s.getX());


    }
}
