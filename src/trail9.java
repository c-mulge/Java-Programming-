//Pass or Fail
import java.util.Scanner;

public class trail9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,sum;
        float per;
        System.out.println("Enter marks of 1st subject: ");
        a=sc.nextInt();
        System.out.println("Enter marks of 2nd subject: ");
        b=sc.nextInt();
        System.out.println("Enter marks of 3rd subject: ");
        c=sc.nextInt();
        sum=a+b+c;
        float avg=(a+b+c)/3.0f;
        per=(float)(sum)*100/300;
        if(avg>=40 && a>=33 && b>=33 && c>=33){
            System.out.println("Congrats you are passed !");
            System.out.println("Percentage: "+per);
        }
        else{
            System.out.println("Sorry you are failed");
        }
    }
}
