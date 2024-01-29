package com.company;

public class MyThreadUsingRunnable {
    public static void main(String[] args) {
        MyThread3 bullet3=new MyThread3();
        Thread gun3=new Thread(bullet3);

        MyThread4 bullet4=new MyThread4();
        Thread gun4=new Thread(bullet4);

        gun3.start();
        gun4.start();

    }

}

class MyThread3 implements Runnable{
    public void run(){
       for(int i=0;i<100;i++){
            System.out.println("I am Thread 3 not a Threat");
        }
    }
}
class MyThread4 implements Runnable{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("I am Thread 4 not a Threat");
        }
    }
}
