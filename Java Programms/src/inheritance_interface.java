
interface sym{
    void m1();
    void m2();
}

interface sym2 extends sym{
    void m3();
    void m4();
}

class mysem implements sym2{
    public void m3(){
        System.out.println("GG");
    }
    public void m4(){
        System.out.println("Rohit Sharma");
    }
    public void m2(){
        System.out.println("Virat Kholi");
    }
    public void m1(){
        System.out.println("KL Rahul");
    }
}

public class inheritance_interface {
    public static void main(String[] args) {
        mysem m =new mysem();
        m.m1();
        m.m2();
        m.m3();
        m.m4();
    }
}
