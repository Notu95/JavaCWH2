package com.company;

public class MyThreadConstructor {
    public static void main(String[] args) {
        MyThread5 bullet5=new MyThread5();
        MyThread6 bullet6=new MyThread6();

        Thread gun5=new Thread(bullet5,"Name1");
        Thread gun6=new Thread(bullet6);

//        gun5.setPriority(10);
//        gun6.setPriority(1);

        gun5.start();
        /************Join method()***********/
//        try{ gun5.join();}
//        catch(Exception e){System.out.println(e);}

        gun6.start();


        System.out.println("Id of Thread gun5 is: "+ gun5.getId());
        System.out.println("Name of Thread gun5 is: "+ gun5.getName());
        System.out.println("Id of Thread gun6 is: "+ gun6.getId());
        System.out.println("Name of Thread gun6 is: "+ gun6.getName());


    }


}
class MyThread5 implements Runnable{
    public void run(){
        Extra1 e1=new Extra1();
        Extra2 e2=new Extra2();
        e1.print();
        //e2.print();
    }
}
class MyThread6 implements Runnable{
    public void run(){
        Extra3 e3=new Extra3();
        Extra4 e4=new Extra4();
        //e3.print();
        e4.print();
        /************Sleep method()***********/
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Extra1{
    void print(){
        for(int i=0;i<250;i++)
        System.out.println("Hey! you Sourav");
    }
}
class Extra2{
    void print(){
        for(int i=0;i<250;i++)
        System.out.println("Hey! you Notu");
    }
}
class Extra3{
    void print(){
        for(int i=0;i<250;i++)
        System.out.println("Hey! you Gourav");
    }
}
class Extra4{
    void print(){
        for(int i=0;i<250;i++)
        System.out.println("Hey! you Natu");
    }
}
