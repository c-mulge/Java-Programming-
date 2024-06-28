import java.util.Scanner;
import java.lang.Math;

public class trail17 {
    static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }
    public static int LCM(int a, int b) {
        return (a * b) / GCD(a, b);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //Q.1 Java Program to Print an Integer (Entered by the User)
        /*System.out.print("Enter a number: ");
        int a=sc.nextInt();
        System.out.println(a);*/

        //  2. Java Program to Add Two Integers
        /*System.out.print("Enter two integers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Addition: "+c);*/

        // 3. Java Program to Multiply two Floating Point Numbers
        /*float x=sc.nextFloat();
        float y=sc.nextFloat();
        float z=x*y;
        System.out.println("Multiplication: "+z);*/

        // 4. Java Program to Find ASCII Value of a character
/*        char c='g';
//        String c=sc.next();
        int ascii=c;
        System.out.println("ASCII value of " +c+" is "+ascii);*/

        // 5. Java Program to Compute Quoient and Remainder
        /*
        int a=12;
        int b=2;
        int c=a/b;
        int d=a%b;
        System.out.println(c);
        System.out.println(d);*/
        // 6. Java Program to Swap Two Numbers
        /*int a=1;
        int b=2;
        System.out.println("Before: ");
        System.out.println("A: " + a);
        System.out.println("B: "+b);
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After: ");
        System.out.println("A: " +a);
        System.out.println("B: "+b);*/
        //7. Java Program to Check Whether a Number is Even or Odd
        /*int a;
        a=sc.nextInt();
        if(a>=0){
            if(a%2==0){
                System.out.println("number is even");
            }
            else{
                System.out.println("number is odd");
            }
        }
        else{
            System.out.println("Number is less than zero");
        }*/


        //8. 8. Java Program to Check Whether an Alphabet is Vowel or Consonant
/*
        System.out.println("Enter an vowel: ");
        char ch=sc.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("Vowel detected");
        }
        else{
            System.out.println("Nah! it's not");
        }*/

        //9. 9. Java Program to Find the Largest Among Three Numbers
        /*
        int a,b,c;
        System.out.print("Enter three numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a==b&&b==c){
            System.out.println("All are equal");
        }
        else{
        if(a>b&&a>c){
            System.out.println("A: "+a+" is greater");
        }
        else if(b>a&&b>c){
            System.out.println("B: "+b+" is greater");
        }
        else{
            System.out.println("C: "+c+" is greater");
        }
        }*/

        //10. 10. Java Program to Find all Roots of a Quadratic Equation
        /*
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double discriminant = b * b - 4 * a * c;
        if(discriminant>0){
            double root1=(-b*Math.sqrt(discriminant))/(2*a);
            double root2=(-b*Math.sqrt(discriminant))/(2*a);
            System.out.println("Roots are real and distinct.");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        }else if(discriminant==0){
            double root = -b / (2 * a);
            System.out.println("Root is real and repeated.");
            System.out.println("Root: " + root);
        }else{
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Roots are complex and imaginary.");
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }
        sc.close();*/
        //11. 11. Java Program to Check Leap Year
        /*
        System.out.println("Enter year: ");
        int year=sc.nextInt();
        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            } else {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        }

        // Output the result
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }*/

        //12. 12. Java Program to Check Whether a Number is Positve or Negative
        /*
        int a;
        System.out.println("Enter a number: ");
        a=sc.nextInt();
        if(a>=0){
            System.out.println("Number is Positive");
        }
        else{
            System.out.println("Number is Negative");
        }*/
        //13. 13. Java Program to Check Whether a Character is Alphabet or Not
        /*
        System.out.print("Enter a character: ");
        char ch=sc.next().charAt(0);
        if(Character.isLetter(ch)){
            System.out.println(ch+" is an Alphabet");
        }
        else {
            System.out.println(ch+" is not an Alphabet");
        }*/

        // 14. Java Program to Calculate the Sum of Natural Numbers
        /*
        System.out.println("Enter the n: ");
        int n=sc.nextInt();
        int sum=0;
        if(n>0){
            for (int i=1;i<=n;i++){
                System.out.println(i);
                sum += i;
            }
            System.out.println("Sum is: "+sum);
        }*/

        //15. Java Program to Find Factorial of a Number
       /*
        System.out.println("Enter the n to find factorial of: ");
        int n=sc.nextInt();
        int fact=1;
        if(n>0){
            for (int i=1;i<=n;i++){
//                System.out.println(i);
                fact *= i;
            }
            System.out.println("Sum is: "+fact);
        }*/
        //16. Java Program to Generate Multiplication of Table
        /*
        int n=sc.nextInt();
//        int mul=1;
        for(int i=1;i<=10;i++){
            System.out.println("2x"+i+" = "+(n*i));
        }*/
        //17. 17. Java Program to Display Fibonacci Series
        /*int n=sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.println(fib(i)+" ");
        }*/
        //18. 18. Java Program to Find GCD of two Numbers.

        /*int a=sc.nextInt();
        int b=sc.nextInt();
        int gcd=GCD(a,b);
        System.out.println("GCD of "+a+" and "+b+" is "+gcd);*/
        // 19. Java Program to Find LCM of two Numbers
        /*int a=sc.nextInt();
        int b=sc.nextInt();
        int lcm=LCM(a,b);
        System.out.println("LCM of "+a+" and "+b+" is "+lcm);*/
        //20. Java Program to Display Characters from A to Z using loop
//        char ch=sc.next().charAt(0);
        /*for(char ch='A';ch<='Z';ch++){
            System.out.print(ch+" ");
        }*/
    }
}
