package com.company;

public class MultiThreading {
    public static void main(String[] args) {
        MyThread1 M1=new MyThread1();
        MyThread2 M2=new MyThread2();

        M1.start();
        M2.start();

    }
}
class MyThread1 extends Thread{
    public void run(){
        int i=0;
        while(i<100) {
            System.out.println("My Thread 1 is running......");
            System.out.println("You are bad guy");
            i++;
//            int j=0;
//            j++;j++;j++;j++;j++;j++;j++;j++;j++;j++;j++;j++;
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        int i=0;
        while(i<100) {
        System.out.println("My Thread 2 is running......");
            System.out.println("You are good guy");
            i++;
        }
    }
}

