import java.util.Scanner;
public class trail3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        float cgpa;
        System.out.println("Enter marks of 1st subject: ");
        a=sc.nextInt();
        System.out.println("Enter marks of 2nd subject: ");
        b=sc.nextInt();
        System.out.println("Enter marks of 3rd subject: ");
        c=sc.nextInt();
        cgpa = (float) (a+b+c)/3;
        System.out.println("CGPA: "+cgpa);
    }
}
