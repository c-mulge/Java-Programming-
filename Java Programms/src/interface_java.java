
interface Bicycle{
    int a=45;
    void brake();
    void speed();
}

// can implement multiple interfaces, but cannot extends multiple classes

class avon implements Bicycle{
    public void brake(){
        System.out.println("Brake applied");
    }
    public void speed(){
        System.out.println("Speed Increased");
    }
}

public class interface_java {
    public static void main(String[] args) {
        avon a= new avon();
        a.speed();
        a.brake();
        System.out.println(a.a);     //cannot modify the value of 'a' declared in interface
    }
}
