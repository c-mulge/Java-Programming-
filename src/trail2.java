import java.util.Scanner;

public class trail2 {
    public static void main(String[] args) {
        int a,b;
        float per;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter out of how much: ");
        a=sc.nextInt();
        System.out.println("Enter Total Marks of 5 subjects: ");
        b= sc.nextInt();
        per=(float) (b*100/a);
        System.out.println("Percentage is: "+per);
    }
}
