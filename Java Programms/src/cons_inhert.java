//here we have used constructor using inheritance
import java.util.*;

class base1{
//    public int x;
    base1(){
        System.out.println("I m a Constructor");
    }
    base1(int x){
        System.out.println("Constructor with value of x: "+x);
    }
}

class derived1 extends base1{
//    public int y;
    derived1(){
        System.out.println("I m derived constructor");
    }
    derived1(int x,int y){
        super(x);
        System.out.println("Derived Constructor with value of y: "+y);
    }
}

class child extends derived1{
    child(){
        System.out.println("I m  child constructor of derived 1");
    }
    child(int x,int y,int z){
        super(x,y);
        System.out.println("Child Constructor with value of z: "+z);
    }
}

public class cons_inhert {
    public static void main(String[] args){
//        derived1 d = new derived1();
//        child c=new child();
        child cd =new child(1,2,3);
    }
}
