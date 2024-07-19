import java.util.*;

class base3{
//    private int a=0;
    public void meth2(){
        System.out.println("Method 2 of base class");
    }
}

class derived3 extends base3{
    @Override
    public void meth2(){
        System.out.println("Method 2 of derived class");
    }
}

public class method_overriding {
    public static void main(String[] args) {
        base3 b = new base3();
        b.meth2();
        derived3 d= new derived3();
        d.meth2();
    }
}
