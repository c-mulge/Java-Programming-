import java.util.*;

class base{
    int x=20;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void printme(){
        System.out.println("<-------Prinitng this------->");
    }
}

class derived extends base{
    public void print(){
        System.out.println();
        System.out.println("Value of x: "+x);
    }
}

class animal{
    String breed="Dog";
    public void printbreed(){
        System.out.println("The animal is a "+breed);
    }
}

class dog extends animal{
    String name="Spikey";
    public void printname(){
        System.out.println(breed+" name is: "+name);
    }
}

public class inheritance {
    public static void main(String[] args){
//        derived d = new derived();
//        d.print();
//        d.printme();

        dog d = new dog();
        d.printbreed();
        d.printname();
    }
}
