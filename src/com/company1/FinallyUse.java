package com.company1;

public class FinallyUse {
    public static void main(String[] args) {
        int a=500,b=0;
        System.out.println("resilt is:  "+ABC.devide(a,b) );
    }

}
class ABC {
    static int devide(int a,int b){
        try {
            int c = a / b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("This must be printed out whether exception blocks or not");
        }
        return 1;
    }
}
