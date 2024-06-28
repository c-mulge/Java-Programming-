import java.util.Scanner;

public class trail10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b;
        System.out.println("Enter you're salary: ");
        a=sc.nextFloat();
        if(a<2.5){
            System.out.println("Not payable");
        }
        else if(a>=2.5 || a<=5.0){
            b=a*(5%100);
            System.out.println("Tax Payable is: "+b);
        } else if (a>5.0 || a<=10.0) {
            b=a*(20%100);
            System.out.println("Tax Payable is: "+b);
        } else if (a>10.0) {
            b=a*(30%100);
            System.out.println("Tax Payable is: "+b);
        }
    }
}
