package com.streams;

public class LambdaExpressions {


    public static void main(String[] args) {
        /*
        A objA= new A(){
            @Override
            public int meth(int x, int y) {
                return x+y;
            }
        };   */

        A objA =(int x,int y) ->(x+y);  //if there is oneline code then brackets are not needed....
                              // and again if it is return statement then no need to mention


        System.out.println(objA.meth(4,5));
    }

}
