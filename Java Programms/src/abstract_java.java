
abstract class base4{
    public void greet(){
        System.out.println("Hello");
    }
    abstract public void sy();
}

class child1 extends base4{
    public void sy(){
        System.out.println("Hey");
    }
}

public class abstract_java {
    public static void main(String[] args){
        child1 c= new child1();
        c.sy();
        c.greet();
        //base4 b= new base4();   --cannot create obj of abstract class
    }
}
