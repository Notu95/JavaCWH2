package com.company1;


public class ThrowThrows {
    public static void main(String[] args) {
        int r=-10;
        try{
            double Area =MyThrowThrows.areaOfCircle(r);
            System.out.printf ("Area of circle of radii %d is:  \n",r);
            System.out.println(Area);
        }
        catch(Exception e){
          ;
            System.out.println(e);
            e.printStackTrace();
            System.out.println(e.getMessage());

        }
    }
}
class MyThrowThrows{
    public static double areaOfCircle(int r) throws NegetiveRadiousException{
        if(r<0){
            throw new NegetiveRadiousException();
        }
        double area= (Math.PI)*r*r;
        return area;

    }
}
class NegetiveRadiousException extends Exception{
    @Override
    public String toString() {
        return "Radious cant be negetive";
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }

    @Override
    public String getMessage() {
        return "pleas provide realistic data";
    }
}