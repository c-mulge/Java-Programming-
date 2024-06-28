import java.util.Scanner;

public class trail6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q.1.
        //float k= (float)7/4*9/2;
        /*
            =(7/4)*9/2
            =1.75*9/2
            =15.75/2
            =7.875
         */
        //System.out.println(k);

        //------------------------------------------------------
        //Q.2.
        //char grade='B';
        //grade = (char)(grade + 8);
        //System.out.println(grade);
        //------------------------------------------
        //Q.3.
        int a=20;
        System.out.println("Given Number is: "+a);
        System.out.print("Enter a number: ");
        int b= sc.nextInt();
        System.out.println(a>=b);
        System.out.println(a<=b);

    }
}
