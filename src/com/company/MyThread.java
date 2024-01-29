package com.company;



class MyThead1 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<40000){
            System.out.println("My Cooking Thread is Running");
            System.out.println("I am happy!");
            i++;
        }
    }
}

class MyThead2 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<40000){
            System.out.println("Thread 2 for Chatting with her");
            System.out.println("I am sad!");
            i++;
        }
    }
}

public class MyThread {
    public static void main(String[] args) {
        MyThead1 t1 = new MyThead1();
        MyThead2 t2 = new MyThead2();
        t1.start();
        t2.start();

    }
}
