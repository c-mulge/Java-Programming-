import java.util.*;

class cylinder{
    private int radius;
    private int height;
//    private double surface_area;
//    private double vol;
    double pi=3.14159265359;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    /*
    public void surfacearea(){
        surface_area= (double) 2*pi*radius*height+2*pi*(radius*radius);
        System.out.println("Surface are= "+surface_area);
    }

    public void volume(){
        vol=pi*(radius*radius)*height;
        System.out.println("Volume= "+vol);
    }*/

    public double surface_area(){
      return 2*pi*radius*height+2*pi*(radius*radius);
    }

    public double volume(){
        return pi*(radius*radius)*height;
    }

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
}

class rectangle{
    private int length;
    private int breadth;

    public rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void display(){
        System.out.println("Length: "+length);
        System.out.println("Breadth: "+breadth);
    }
}

public class exe1 {
    public static void main(String[] args) {
        //problem 1
        //defining obj
        cylinder mycil = new cylinder(4,12);              //Problem 3
        /*
        mycil.setHeight(12);
        mycil.setRadius(4);
        System.out.println(mycil.getHeight());
        System.out.println(mycil.getRadius());
         */


        //Problem 2
        //finding surface area and volume
//        System.out.println(mycil.surface_area());
//        System.out.println(mycil.volume());



        //Problem 4
        rectangle rec =new rectangle(11,12);
        rec.display();

    }
}