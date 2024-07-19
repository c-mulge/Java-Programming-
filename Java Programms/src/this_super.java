import java.util.*;

class base2{
    private int a=0;

    public int getA() {
        return a;
    }
    base2(int a){
        this.a=a;
    }
}

class derived2 extends base2{
    //private int b;
    derived2(int b){
        super(b);
        System.out.println("I m a constructor");
    }
}

public class this_super {
    public static void main(String[] args) {
        base2 b=new base2(5);
        derived2 d=new derived2(10);
        System.out.println(b.getA());
    }
}
